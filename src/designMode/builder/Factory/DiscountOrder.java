package designMode.builder.Factory;

public class DiscountOrder implements Order {
    @Override
    public void process() {
        // 处理优惠订单的逻辑
        System.out.println("Processing discount order...");
    }
}
