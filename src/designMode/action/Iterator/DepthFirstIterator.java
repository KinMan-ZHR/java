package designMode.action.Iterator;

import java.util.Stack;

public class DepthFirstIterator implements FileSystemIterator {
    private final Stack<FileSystemNode> stack = new Stack<>();

    public DepthFirstIterator(Directory root) {
        stack.push(root);
    }

    @Override
    public boolean hasNext() {
        return !stack.isEmpty();
    }

    @Override
    public FileSystemNode next() {
        if (stack.isEmpty()) {
            throw new IllegalStateException("No more elements to iterate.");
        }

        FileSystemNode node = stack.pop();
        if (node instanceof Directory) {
            Directory directory = (Directory) node;
            for (int i = directory.getChildren().size() - 1; i >= 0; i--) {
                stack.push(directory.getChildren().get(i));
            }
        }
        return node;
    }
}