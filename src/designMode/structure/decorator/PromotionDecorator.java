package designMode.structure.decorator;

public abstract class PromotionDecorator implements Product {
    protected Product product;
 
    public PromotionDecorator(Product product) {
        this.product = product;
    }
 
    @Override
    public String getName() {
        return product.getName();
    }
 
    @Override
    public double getPrice() {
        return product.getPrice();
    }
}
 