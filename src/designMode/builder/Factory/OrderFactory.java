package designMode.builder.Factory;

public class OrderFactory {
    public Order createOrder(String orderType) {
        if (orderType.equalsIgnoreCase("Normal")) {
            return new NormalOrder();
        } else if (orderType.equalsIgnoreCase("Group")) {
            return new GroupOrder();
        } else if (orderType.equalsIgnoreCase("Discount")) {
            return new DiscountOrder();
        } else {
            throw new IllegalArgumentException("Invalid order type: " + orderType);
        }
    }
}
 