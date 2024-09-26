package designMode.structure.composite;

public class Category implements Component {
    private String name;
 
    public Category(String name) {
        this.name = name;
    }
 
    @Override
    public void operation() {
        System.out.println("Category: " + name);
    }
}
 
