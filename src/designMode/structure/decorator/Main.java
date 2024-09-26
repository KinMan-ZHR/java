package designMode.structure.decorator;

public class Main {
    public static void main(String[] args) {
        Product product = new ConcreteProduct("iPhone", 1000.0);
 
        // 打折促销
        PromotionDecorator discountDecorator = new DiscountDecorator(product, 0.2);
        System.out.println("Discounted Price: " + discountDecorator.getPrice());
 
        // 满减促销
        PromotionDecorator reductionDecorator = new ReductionDecorator(product, 800.0, 100.0);
        System.out.println("Reduced Price: " + reductionDecorator.getPrice());
 
        // 组合促销
        PromotionDecorator comboDecorator = new ReductionDecorator(new DiscountDecorator(product, 0.2), 800.0, 100.0);
        System.out.println("Discounted and Reduced Price: " + comboDecorator.getPrice());
    }
}
 