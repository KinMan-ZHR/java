package designMode.structure.proxy.dynmaticProxy;

// 实际的订单服务类
public class OrderServiceImpl implements OrderService {
    @Override
    public void createOrder() {
        System.out.println("创建订单");
    }
 
    @Override
    public void updateOrder() {
        System.out.println("更新订单");
    }
}
