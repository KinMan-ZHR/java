package designMode.structure.proxy.staticProxy;

// 实际的订单服务类
public class OrderServiceImpl implements OrderService {
    @Override
    public void createOrder() {
        System.out.println("创建订单");
    }
}
