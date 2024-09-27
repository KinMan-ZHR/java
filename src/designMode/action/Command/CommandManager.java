package designMode.action.Command;

import java.util.Stack;

public class CommandManager {
    private final Stack<Command> commands = new Stack<>();

    public void executeCommand(Command command) {
        command.execute();
        commands.push(command);
    }

    public void undoLastCommand() {
        if (!commands.isEmpty()) {
            Command command = commands.pop();
            command.undo();
        } else {
            System.out.println("No commands to undo.");
        }
    }
}