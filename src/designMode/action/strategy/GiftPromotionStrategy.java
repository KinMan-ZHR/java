package designMode.action.strategy;

// 赠品策略
public  class GiftPromotionStrategy implements PromotionStrategy {
    @Override
    public void applyPromotion() {
        System.out.println("Applying Gift Promotion");
    }
}
