package designMode.action.Iterator;

public class FileTypeFilterIterator implements FileSystemIterator {
    private final FileSystemIterator iterator;
    private final String fileType;
    private FileSystemNode nextNode;

    public FileTypeFilterIterator(FileSystemIterator iterator, String fileType) {
        this.iterator = iterator;
        this.fileType = fileType;
        findNextFile();
    }

    private void findNextFile() {
        while (iterator.hasNext()) {
            FileSystemNode node = iterator.next();
            if (node instanceof File && ((File) node).getType().equals(fileType)) {
                nextNode = node;
                return;
            }
        }
        nextNode = null;
    }

    @Override
    public boolean hasNext() {
        return nextNode != null;
    }

    @Override
    public FileSystemNode next() {
        if (nextNode == null) {
            throw new IllegalStateException("No more elements to iterate.");
        }
        FileSystemNode result = nextNode;
        findNextFile();
        return result;
    }
}