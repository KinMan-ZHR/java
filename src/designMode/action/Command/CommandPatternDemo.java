package designMode.action.Command;

public class CommandPatternDemo {
    public static void main(String[] args) {
        TextEditor editor = new TextEditor();
        Clipboard.setClipboardText("Clipboard text");

        CommandManager manager = new CommandManager();

        // 设置初始文本
        editor.setText("Initial text");
        System.out.println("Current text: " + editor.getText());

        // 执行复制命令
        manager.executeCommand(new CopyCommand(editor));

        // 执行粘贴命令
        manager.executeCommand(new PasteCommand(editor));
        System.out.println("Current text: " + editor.getText());

        // 撤销最后一个命令
        manager.undoLastCommand();
        System.out.println("Current text: " + editor.getText());

        // 再次撤销
        manager.undoLastCommand();
        System.out.println("Current text: " + editor.getText());
    }
}