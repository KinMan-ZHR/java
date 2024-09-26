package designMode.structure.decorator;

public class ReductionDecorator extends PromotionDecorator {
    private double threshold;
    private double reduction;
 
    public ReductionDecorator(Product product, double threshold, double reduction) {
        super(product);
        this.threshold = threshold;
        this.reduction = reduction;
    }
 
    @Override
    public double getPrice() {
        double originalPrice = super.getPrice();
        if (originalPrice >= threshold) {
            return originalPrice - reduction;
        }
        return originalPrice;
    }
}
