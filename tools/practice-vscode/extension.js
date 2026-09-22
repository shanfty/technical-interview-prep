const vscode = require('vscode');
const path = require('node:path');

async function findProblemStatements() {
    const statements = await vscode.workspace.findFiles('problems/*/*/problem.md');
    return Promise.all(statements.map(async (uri) => {
        const document = await vscode.workspace.openTextDocument(uri);
        const heading = document.getText().match(/^#\s+(.+?)\s*$/m);
        return {
            label: heading ? heading[1] : path.posix.basename(path.posix.dirname(uri.path)),
            description: vscode.workspace.asRelativePath(uri, true),
            uri
        };
    }));
}

async function openSelectedProblem(selected) {
    const problemFolder = vscode.Uri.joinPath(selected.uri, '..');
    const metadata = vscode.Uri.joinPath(problemFolder, 'metadata.yaml');
    const hasMetadata = await vscode.workspace.fs.stat(metadata).then(() => true).catch(() => false);
    const solutions = await vscode.workspace.findFiles(
        new vscode.RelativePattern(problemFolder, 'java/src/main/java/**/Solution.java')
    );
    solutions.sort((a, b) => a.path.localeCompare(b.path));

    let solution = solutions[0];
    if (solutions.length > 1) {
        const selectedSolution = await vscode.window.showQuickPick(
            solutions.map((uri) => ({
                label: path.posix.relative(problemFolder.path, uri.path),
                uri
            })),
            { title: 'Choose a Java implementation' }
        );
        if (!selectedSolution) return;
        solution = selectedSolution.uri;
    }

    await vscode.window.showTextDocument(selected.uri, { viewColumn: vscode.ViewColumn.One, preview: true });
    await vscode.commands.executeCommand(
        'markdown.showPreview', selected.uri, undefined, { locked: true }
    );
    await vscode.commands.executeCommand('vscode.setEditorLayout', {
        orientation: 0,
        groups: [{ size: 0.34 }, { size: 0.33 }, { size: 0.33 }]
    });

    if (solution) {
        await vscode.window.showTextDocument(solution, {
            viewColumn: vscode.ViewColumn.Two,
            preview: false
        });
    }
    if (hasMetadata) {
        await vscode.window.showTextDocument(metadata, {
            viewColumn: vscode.ViewColumn.Three,
            preview: false
        });
    }

    if (!solution || !hasMetadata) {
        const missing = [
            !solution && 'Java Solution.java',
            !hasMetadata && 'metadata.yaml'
        ].filter(Boolean).join(' and ');
        await vscode.window.showInformationMessage(
            `Opened the statement. This exercise has no ${missing}.`
        );
    }
}

async function openProblem() {
    if (!vscode.workspace.workspaceFolders?.length) {
        await vscode.window.showInformationMessage('Open your interview practice repository first.');
        return;
    }

    const statements = await findProblemStatements();
    if (!statements.length) {
        await vscode.window.showInformationMessage(
            'No problems found. Open the repository root containing the problems folder.'
        );
        return;
    }

    statements.sort((a, b) => a.label.localeCompare(b.label)
        || a.description.localeCompare(b.description));
    const selected = await vscode.window.showQuickPick(statements, {
        title: 'Practice: Open Problem',
        placeHolder: 'Choose an exercise',
        matchOnDescription: true
    });
    if (selected) await openSelectedProblem(selected);
}

async function openRandomUnsolved() {
    if (!vscode.workspace.workspaceFolders?.length) {
        await vscode.window.showInformationMessage('Open your interview practice repository first.');
        return;
    }

    const statements = await findProblemStatements();
    const unsolved = [];
    for (const statement of statements) {
        const metadataUri = vscode.Uri.joinPath(statement.uri, '..', 'metadata.yaml');
        try {
            const metadata = await vscode.workspace.fs.readFile(metadataUri);
            if (/^status:\s*unsolved\s*$/mi.test(Buffer.from(metadata).toString('utf8'))) {
                unsolved.push(statement);
            }
        } catch {
            // Problems without metadata cannot be selected as unsolved.
        }
    }

    if (!unsolved.length) {
        await vscode.window.showInformationMessage('No unsolved problems found.');
        return;
    }

    await openSelectedProblem(unsolved[Math.floor(Math.random() * unsolved.length)]);
}

function activate(context) {
    context.subscriptions.push(vscode.commands.registerCommand(
        'interviewPractice.openProblem',
        async () => {
            try {
                await openProblem();
            } catch (error) {
                await vscode.window.showErrorMessage(
                    `Could not open the exercise: ${error instanceof Error ? error.message : String(error)}`
                );
            }
        }
    ));
    context.subscriptions.push(vscode.commands.registerCommand(
        'interviewPractice.openRandomUnsolved',
        async () => {
            try {
                await openRandomUnsolved();
            } catch (error) {
                await vscode.window.showErrorMessage(
                    `Could not open a random unsolved exercise: ${error instanceof Error ? error.message : String(error)}`
                );
            }
        }
    ));
}

module.exports = { activate };

