const vscode = require('vscode');
const path = require('node:path');

async function openProblem() {
    if (!vscode.workspace.workspaceFolders?.length) {
        await vscode.window.showInformationMessage('Open your interview practice repository first.');
        return;
    }

    // Search afresh so newly added problems appear without updating the extension.
    const statements = await vscode.workspace.findFiles('problems/*/*/problem.md');
    if (!statements.length) {
        await vscode.window.showInformationMessage(
            'No problems found. Open the repository root containing the problems folder.'
        );
        return;
    }

    const choices = await Promise.all(statements.map(async (uri) => {
        const document = await vscode.workspace.openTextDocument(uri);
        const heading = document.getText().match(/^#\s+(.+?)\s*$/m);
        return {
            label: heading ? heading[1] : path.posix.basename(path.posix.dirname(uri.path)),
            description: vscode.workspace.asRelativePath(uri, true),
            uri
        };
    }));
    choices.sort((a, b) => a.label.localeCompare(b.label)
        || a.description.localeCompare(b.description));

    const selected = await vscode.window.showQuickPick(choices, {
        title: 'Practice: Open Problem',
        placeHolder: 'Choose an exercise',
        matchOnDescription: true
    });
    if (!selected) return;

    const problemFolder = vscode.Uri.joinPath(selected.uri, '..');
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

    // The Markdown command uses the active text editor's column.
    await vscode.window.showTextDocument(selected.uri, {
        viewColumn: vscode.ViewColumn.One,
        preview: true
    });
    await vscode.commands.executeCommand(
        'markdown.showPreview', selected.uri, undefined, { locked: true }
    );

    if (!solution) {
        await vscode.window.showInformationMessage(
            'Opened the statement. This exercise has no Java Solution.java under java/src/main/java yet.'
        );
        return;
    }

    await vscode.commands.executeCommand('vscode.setEditorLayout', {
        orientation: 0,
        groups: [{ size: 0.5 }, { size: 0.5 }]
    });
    await vscode.window.showTextDocument(solution, {
        viewColumn: vscode.ViewColumn.Two,
        preview: false
    });
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
}

module.exports = { activate };
