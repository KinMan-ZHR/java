package designMode.action.Iterator;

import java.util.ArrayList;
import java.util.List;

public class Directory implements FileSystemNode {
    private final String name;
    private final List<FileSystemNode> children = new ArrayList<>();

    public Directory(String name) {
        this.name = name;
    }

    @Override
    public String getName() {
        return name;
    }

    public void addChild(FileSystemNode child) {
        children.add(child);
    }

    public List<FileSystemNode> getChildren() {
        return children;
    }
}
