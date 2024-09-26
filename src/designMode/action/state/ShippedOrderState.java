package designMode.action.state;

public class ShippedOrderState implements OrderState {
    @Override
    public void handle(Order order) {
        System.out.println("Handling shipped order: " + order.getId());
        // 处理已发货订单的逻辑
        // 这里可以继续切换到其他状态，例如 DeliveredOrderState
    }


}
