package designMode.action.state;

public class StatePatternDemo {
    public static void main(String[] args) {
        Order order = new Order(123);

        // 初始状态是新订单
        order.process();  // 输出: Handling new order: 123

        // 状态自动转换为已发货订单
        order.process();  // 输出: Handling shipped order: 123
    }
}