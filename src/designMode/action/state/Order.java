package designMode.action.state;

public class Order {
    private int id;
    private OrderState state;

    public Order(int id) {
        this.id = id;
        this.state = new NewOrderState();  // 默认状态为新订单
    }

    public void setState(OrderState state) {
        this.state = state;
    }

    public int getId() {
        return id;
    }

    public void process() {
        state.handle(this);
    }
}