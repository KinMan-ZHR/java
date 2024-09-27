package designMode.action.Iterator;

public class File implements FileSystemNode {
    private final String name;
    private final String type;

    public File(String name, String type) {
        this.name = name;
        this.type = type;
    }

    @Override
    public String getName() {
        return name;
    }

    public String getType() {
        return type;
    }
}
