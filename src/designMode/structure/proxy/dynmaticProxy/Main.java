package designMode.structure.proxy.dynmaticProxy;

import java.lang.reflect.Proxy;

// 使用示例
public class Main {
    public static void main(String[] args) {
        OrderService orderService = new OrderServiceImpl(); // 创建实际的订单服务对象
 
        // 创建动态代理对象
        OrderService loggingProxy = (OrderService) Proxy.newProxyInstance(
                orderService.getClass().getClassLoader(),
                orderService.getClass().getInterfaces(),
                new LoggingProxy(orderService)
        );
 
        loggingProxy.createOrder(); // 调用代理对象的方法
        loggingProxy.updateOrder();
    }
}
