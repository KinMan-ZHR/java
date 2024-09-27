package designMode.action.Command;

public class Clipboard {
    private static String clipboardText;

    public static String getClipboardText() {
        return clipboardText;
    }

    public static void setClipboardText(String text) {
        clipboardText = text;
    }
}
