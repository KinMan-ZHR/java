package designMode.action.Memento;

// 商品类
class Product {
    private String name;
    private double price;
 
    public Product(String name, double price) {
        this.name = name;
        this.price = price;
    }
 
    public String getName() {
        return name;
    }
 
    public double getPrice() {
        return price;
    }
 
    // 创建备忘录对象
    public ProductMemento createMemento() {
        return new ProductMemento(name, price);
    }
 
    // 从备忘录对象恢复状态
    public void restoreMemento(ProductMemento memento) {
        this.name = memento.getName();
        this.price = memento.getPrice();
    }

    public void setName(String iPad) {
        this.name = iPad;
    }

    public void setPrice(double v) {
        this.price = v;
    }
}
 