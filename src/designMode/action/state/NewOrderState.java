package designMode.action.state;

public class NewOrderState implements OrderState {
    @Override
    public void handle(Order order) {
        System.out.println("Handling new order: " + order.getId());
        // 处理新订单的逻辑
        order.setState(new ShippedOrderState());
    }
}

