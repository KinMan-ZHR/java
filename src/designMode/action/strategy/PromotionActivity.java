package designMode.action.strategy;
/**
 * 策略模式：定义一系列算法，将每个算法封装起来，并且使他们可以相互替换，此模式让算法的变化不会影响到使用算法的客户。
 * 策略模式主要解决：主要解决在有多种算法相似的情况下，使用 if... else 或者 switch ... case
 * 				   statements 来选择算法，这样将会产生很多重复的代码，而策略模式可以避免上述问题。
 * 策略模式属于对象行为模式，它定义了算法家族，分别封装起来，让它们之间可以互相替换，此模式让算法的变化不会影响到使用算法的客户。
 *
 */
class PromotionActivity {
    private PromotionStrategy promotionStrategy;
 
    public PromotionActivity(PromotionStrategy promotionStrategy) {
        this.promotionStrategy = promotionStrategy;
    }
    public void setPromotionStrategy(PromotionStrategy promotionStrategy) {
        this.promotionStrategy = promotionStrategy;
    }
 
    public void executePromotion() {
        promotionStrategy.applyPromotion();
    }
}
 