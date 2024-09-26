package designMode.action.strategy;

// 折扣策略
public  class PercentagePromotionStrategy implements PromotionStrategy {
    @Override
    public void applyPromotion() {
        System.out.println("Applying Percentage Promotion");
    }
}
