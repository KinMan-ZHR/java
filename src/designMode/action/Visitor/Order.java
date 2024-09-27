package designMode.action.Visitor;

import java.util.List;

// 订单类
class Order {
    private String orderNumber;
    private List<String> products;
 
    public Order(String orderNumber, List<String> products) {
        this.orderNumber = orderNumber;
        this.products = products;
    }
 
    public String getOrderNumber() {
        return orderNumber;
    }
 
    public List<String> getProducts() {
        return products;
    }
 
    // 接受访问者的方法
    public void accept(Visitor visitor) {
        visitor.visit(this);
    }
}
 