package designMode.action.Command;

public class CopyCommand implements Command {
    private final TextEditor editor;
    private String copiedText;

    public CopyCommand(TextEditor editor) {
        this.editor = editor;
    }

    @Override
    public void execute() {
        copiedText = editor.getText();
        System.out.println("Copied: " + copiedText);
    }

    @Override
    public void undo() {
        // 复制操作通常是不可撤销的
        System.out.println("Copy command cannot be undone.");
    }
}

