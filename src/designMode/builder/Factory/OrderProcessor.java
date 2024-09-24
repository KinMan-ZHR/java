package designMode.builder.Factory;

public class OrderProcessor {
    private final OrderFactory orderFactory;
 
    public OrderProcessor(OrderFactory orderFactory) {
        this.orderFactory = orderFactory;
    }
 
    public void processOrder(String orderType) {
      Order order = orderFactory.createOrder(orderType);
      order.process();
    }
}
       
 