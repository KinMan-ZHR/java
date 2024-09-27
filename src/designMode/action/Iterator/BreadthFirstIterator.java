package designMode.action.Iterator;

import java.util.Queue;
import java.util.LinkedList;

public class BreadthFirstIterator implements FileSystemIterator {
    private final Queue<FileSystemNode> queue = new LinkedList<>();

    public BreadthFirstIterator(Directory root) {
        queue.offer(root);
    }

    @Override
    public boolean hasNext() {
        return !queue.isEmpty();
    }

    @Override
    public FileSystemNode next() {
        if (queue.isEmpty()) {
            throw new IllegalStateException("No more elements to iterate.");
        }

        FileSystemNode node = queue.poll();
        if (node instanceof Directory) {
            Directory directory = (Directory) node;
            for (FileSystemNode child : directory.getChildren()) {
                queue.offer(child);
            }
        }
        return node;
    }
}