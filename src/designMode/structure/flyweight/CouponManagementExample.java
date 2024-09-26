package designMode.structure.flyweight;

public class CouponManagementExample {
    public static void main(String[] args) {
        Coupon coupon1 = CouponFactory.getCoupon("CODE123", 10.0, "Category A");
        Coupon coupon2 = CouponFactory.getCoupon("CODE123", 10.0, "Category A");
 
        // coupon1 和 coupon2 引用同一个享元对象，因为它们的公共信息相同
        System.out.println(coupon1 == coupon2); // 输出：true
 
        coupon1.applyCoupon("Product A");
        coupon2.applyCoupon("Product B");
    }
}
 