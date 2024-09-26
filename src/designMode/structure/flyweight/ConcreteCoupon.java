package designMode.structure.flyweight;

public class ConcreteCoupon implements Coupon {
    private String couponCode;
    private double discountAmount;
    private String applicableRange;
 
    public ConcreteCoupon(String couponCode, double discountAmount, String applicableRange) {
        this.couponCode = couponCode;
        this.discountAmount = discountAmount;
        this.applicableRange = applicableRange;
    }
 
    @Override
    public void applyCoupon(String productId) {
        System.out.println("Applying coupon " + couponCode + " to product " + productId +
                ". Discount: " + discountAmount + ", Applicable Range: " + applicableRange);
    }
}
 