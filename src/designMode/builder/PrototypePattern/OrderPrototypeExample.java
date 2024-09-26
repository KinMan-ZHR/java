package designMode.builder.PrototypePattern;

import java.util.Arrays;
 
public class OrderPrototypeExample {
    public static void main(String[] args) {
        // 创建一个原型订单对象
        Order prototypeOrder = new Order("123456", Arrays.asList("Product A", "Product B"), "Shipping Address");
 
        try {
            // 克隆原型订单对象生成新的订单
            Order newOrder = prototypeOrder.clone();
 
            // 修改新订单的一些属性
            newOrder.setOrderId("789012");
            newOrder.getProductList().add("Product C");
            newOrder.setShippingAddress("New Shipping Address");
 
            // 输出原型订单和新订单的信息
            System.out.println("Prototype Order: " + prototypeOrder.getOrderId() + ", " +
                    prototypeOrder.getProductList() + ", " + prototypeOrder.getShippingAddress());
            System.out.println("New Order: " + newOrder.getOrderId() + ", " +
                    newOrder.getProductList() + ", " + newOrder.getShippingAddress());
        } catch (CloneNotSupportedException e) {
            e.printStackTrace();
        }
    }
}