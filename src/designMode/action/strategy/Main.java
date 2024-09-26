package designMode.action.strategy;

public class Main {
    public static void main(String[] args) {
        PromotionActivity promotionActivity1 = new PromotionActivity(new DiscountPromotionStrategy());
        promotionActivity1.executePromotion();

        PromotionActivity promotionActivity2 = new PromotionActivity(new PercentagePromotionStrategy());
        promotionActivity2.executePromotion();

        PromotionActivity promotionActivity3 = new PromotionActivity(new GiftPromotionStrategy());
        promotionActivity3.executePromotion();


    }
}
 