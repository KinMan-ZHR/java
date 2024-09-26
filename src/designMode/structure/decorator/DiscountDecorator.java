package designMode.structure.decorator;

public class DiscountDecorator extends PromotionDecorator {
    private double discount;
 
    public DiscountDecorator(Product product, double discount) {
        super(product);
        this.discount = discount;
    }
 
    @Override
    public double getPrice() {
        double originalPrice = super.getPrice();
        return originalPrice * (1 - discount);
    }
}
 
