package designMode.builder.Factory;

public class GroupOrder implements Order {
    @Override
    public void process() {
        // 处理团购订单的逻辑
        System.out.println("Processing group order...");
    }
}
