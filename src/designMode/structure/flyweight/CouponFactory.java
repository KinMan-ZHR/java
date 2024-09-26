package designMode.structure.flyweight;

import java.util.HashMap;
import java.util.Map;
 
public class CouponFactory {
    private static Map<String, Coupon> coupons = new HashMap<>();
 
    public static Coupon getCoupon(String couponCode, double discountAmount, String applicableRange) {
        String key = couponCode + discountAmount + applicableRange;
        Coupon coupon = coupons.get(key);
 
        if (coupon == null) {
            coupon = new ConcreteCoupon(couponCode, discountAmount, applicableRange);
            coupons.put(key, coupon);
        }
 
        return coupon;
    }
}
 