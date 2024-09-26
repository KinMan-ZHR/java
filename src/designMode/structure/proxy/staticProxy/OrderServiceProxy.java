package designMode.structure.proxy.staticProxy;

// 权限代理类
public class OrderServiceProxy implements OrderService {
    private OrderService orderService;
 
    public OrderServiceProxy(OrderService orderService) {
        this.orderService = orderService;
    }
 
    @Override
    public void createOrder() {
        // 权限验证逻辑
        if (checkUserPermission()) {
            orderService.createOrder();
        } else {
            throw new SecurityException("无权限执行该操作");
        }
    }
 
    private boolean checkUserPermission() {
        // 权限验证逻辑实现
        // ...
        return true; // 假设权限验证通过
    }
}
