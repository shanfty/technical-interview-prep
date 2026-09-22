# Interview Practice for VS Code

A local extension that adds **Practice: Open Problem** and **Practice: Open Random Unsolved** to the Command Palette.
Select an exercise to open its Markdown statement on the left, its Java starter
or implementation in the middle, and its `metadata.yaml` on the right.
The random command selects only exercises whose metadata contains
`status: unsolved`.

## 1. Understand the files

- `package.json` declares the extension name, JavaScript entry point, and command.
  The command's category and title form `Practice: Open Problem` in VS Code.
- `extension.js` registers that command, discovers statements, shows the picker,
  and opens the selected files. VS Code supplies the `vscode` module at runtime.
- The repository's `.vscode/launch.json` lets you run this extension with F5.
- `.vscode/practice-dev.code-workspace` points to the same repository through a
  separate workspace identity so the development window can open it while the
  original window already has the repository folder open.

There are no runtime dependencies to install and no compilation step.

## 2. Try it before installing

1. Open the **technical-interview-prep repository root** in VS Code.
2. Open **Run and Debug** (`Ctrl+Shift+D`).
3. Select **Run Practice Extension** in the configuration dropdown, then press F5.
4. A separate **Extension Development Host** window opens the **practice-dev**
   workspace, which contains this repository. There is no need to use Open Folder.
5. In that new window, press `Ctrl+Shift+P` and run **Practice: Open Problem**.
6. Select an exercise. Confirm its rendered statement appears on the left,
   its matching `Solution.java` appears in the middle, and `metadata.yaml`
   appears on the right.
7. Run the command again and choose a different exercise to check the pairing.

The development window edits the real repository files. Closing it ends the
trial session; permanent installation is a separate step below.

If **Open Folder** switches you back to the original window, close the development
window and launch **Run Practice Extension** again from the original window. The
launch configuration opens the separate workspace file automatically. Opening the
repository directly as a folder instead can redirect to the existing window.

If you edit the extension, restart debugging to load your changes. You can set
a breakpoint inside `openProblem` in the original window to follow execution.

## 3. Package and install once

With Node.js and npm installed, run these commands in PowerShell from the
repository root:

```powershell
cd tools/practice-vscode
npm.cmd run check
npx.cmd --yes @vscode/vsce package --allow-missing-repository --skip-license
```

The last command downloads Microsoft's packaging tool and creates
`interview-practice-0.0.1.vsix` in this directory. The local publisher name is
just an identifier; packaging and installing locally require no Marketplace
account. Nothing is published.

In your normal VS Code window, run **Extensions: Install from VSIX...** from
the Command Palette and select that file. Reload if VS Code prompts you.

You can now run **Practice: Open Problem** in your normal window without F5.

## 4. Use it for each exercise

The picker discovers `problems/<category>/<problem>/problem.md` each time it
opens. It reads titles from the first level-one Markdown heading, with the
folder name as a fallback. New problems appear automatically.

The Java file must match:

```text
problems/<category>/<problem>/java/src/main/java/**/Solution.java
```

All current Java exercises follow this layout. If several files match, you
choose one. If none match, the statement still opens with an explanatory
message. Other languages need an extension update to locate their starters.

The command arranges three editor columns and focuses the solution. The statement
preview is locked to the selected problem so opening another Markdown file does
not change it. Existing tabs and edits remain open; earlier problem previews
may remain as tabs. Update `metadata.yaml` from `status: unsolved` to
`status: solved` after completing an exercise. The extension does not run tests
or change branches. It opens the files from your currently checked-out branch.

To add shortcuts, open **Preferences: Open Keyboard Shortcuts** and search for
the command. Recommended bindings are **Ctrl+Alt+P** for **Practice: Open
Problem** and **Ctrl+Alt+U** for **Practice: Open Random Unsolved**. If either
combination is already assigned, choose another unused shortcut.

After changing the extension, increment `version` in `package.json`, package it
again, and install the new VSIX. Adding exercises does not require reinstalling.

## References

- [VS Code extension tutorial](https://code.visualstudio.com/api/get-started/your-first-extension)
- [Packaging extensions](https://code.visualstudio.com/api/working-with-extensions/publishing-extension)
