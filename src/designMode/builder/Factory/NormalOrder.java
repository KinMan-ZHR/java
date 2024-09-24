package designMode.builder.Factory;

public class NormalOrder implements Order {
    @Override
    public void process() {
        // 处理普通订单的逻辑
        System.out.println("Processing normal order...");
    }
}
 
