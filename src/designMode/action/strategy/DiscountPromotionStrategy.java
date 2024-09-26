package designMode.action.strategy;

// 满减策略
public class DiscountPromotionStrategy implements PromotionStrategy {
    @Override
    public void applyPromotion() {
        System.out.println("Applying Discount Promotion");
    }
}

