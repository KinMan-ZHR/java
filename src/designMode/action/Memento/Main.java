package designMode.action.Memento;

public class Main {
    public static void main(String[] args) {
        ProductCaretaker caretaker = new ProductCaretaker();
 
        // 创建商品对象
        Product product = new Product("iPhone", 999.99);
 
        // 保存商品状态
        caretaker.save(product.createMemento());
 
        // 修改商品状态
        product.setName("iPad");
        product.setPrice(799.99);
 
        // 恢复商品状态
        product.restoreMemento(caretaker.restore());
 
        // 打印商品信息
        System.out.println("Name: " + product.getName());
        System.out.println("Price: " + product.getPrice());
    }
}
 