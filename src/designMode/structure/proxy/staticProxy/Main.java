package designMode.structure.proxy.staticProxy;

// 使用示例
public class Main {
    public static void main(String[] args) {
        OrderService orderService = new OrderServiceImpl(); // 创建实际的订单服务对象
        OrderServiceProxy orderServiceProxy = new OrderServiceProxy(orderService); // 创建订单服务代理对象
 
        orderServiceProxy.createOrder(); // 调用代理对象的方法
    }
}
