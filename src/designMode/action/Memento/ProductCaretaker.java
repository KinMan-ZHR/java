package designMode.action.Memento;

// 负责人类
class ProductCaretaker {
    private ProductMemento memento;
 
    public void save(ProductMemento memento) {
        this.memento = memento;
    }
 
    public ProductMemento restore() {
        return memento;
    }
}
 