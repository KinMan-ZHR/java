package designMode.action.Memento;

// 备忘录类
class ProductMemento {
    private String name;
    private double price;
 
    public ProductMemento(String name, double price) {
        this.name = name;
        this.price = price;
    }
 
    public String getName() {
        return name;
    }
 
    public double getPrice() {
        return price;
    }
}
 