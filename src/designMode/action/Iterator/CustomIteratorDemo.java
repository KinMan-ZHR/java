package designMode.action.Iterator;

public class CustomIteratorDemo {
    public static void main(String[] args) {
        // 创建文件系统结构
        Directory root = new Directory("root");
        Directory subDir1 = new Directory("subDir1");
        Directory subDir2 = new Directory("subDir2");

        File file1 = new File("file1.txt", "txt");
        File file2 = new File("file2.jpg", "jpg");
        File file3 = new File("file3.txt", "txt");

        subDir1.addChild(file1);
        subDir1.addChild(file2);
        subDir2.addChild(file3);

        root.addChild(subDir1);
        root.addChild(subDir2);

        // 使用深度优先迭代器
        System.out.println("Depth-First Traversal:");
        FileSystemIterator depthFirstIterator = new DepthFirstIterator(root);
        while (depthFirstIterator.hasNext()) {
            FileSystemNode node = depthFirstIterator.next();
            System.out.println(node.getName());
        }

        // 使用广度优先迭代器
        System.out.println("\nBreadth-First Traversal:");
        FileSystemIterator breadthFirstIterator = new BreadthFirstIterator(root);
//        while (breadthFirstIterator.hasNext()) {
//            FileSystemNode node = breadthFirstIterator.next();
//            System.out.println(node.getName());
//        }

        // 使用按文件类型过滤的迭代器
        System.out.println("\nFiltered by File Type (txt):");
        FileSystemIterator filteredIterator = new FileTypeFilterIterator(breadthFirstIterator, "txt");
        while (filteredIterator.hasNext()) {
            FileSystemNode node = filteredIterator.next();
            System.out.println(node.getName());
        }
    }
}