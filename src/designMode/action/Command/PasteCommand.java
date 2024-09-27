package designMode.action.Command;

public class PasteCommand implements Command {
    private final TextEditor editor;
    private String previousText;

    public PasteCommand(TextEditor editor) {
        this.editor = editor;
    }

    @Override
    public void execute() {
        previousText = editor.getText();
        editor.setText(Clipboard.getClipboardText());
        System.out.println("Pasted: " + editor.getText());
    }

    @Override
    public void undo() {
        editor.setText(previousText);
        System.out.println("Undid paste, restored: " + editor.getText());
    }
}
