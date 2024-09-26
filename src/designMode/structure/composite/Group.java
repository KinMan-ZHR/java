package designMode.structure.composite;

import java.util.ArrayList;
import java.util.List;

public class Group implements Component {
    private List<Component> components = new ArrayList<>();
 
    public void add(Component component) {
        components.add(component);
    }
 
    public void remove(Component component) {
        components.remove(component);
    }
 
    public Component getChild(int index) {
        return components.get(index);
    }
 
    @Override
    public void operation() {
        System.out.println("Group:");
 
        for (Component component : components) {
            component.operation();
        }
    }
}
