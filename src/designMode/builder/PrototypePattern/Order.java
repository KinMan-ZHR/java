package designMode.builder.PrototypePattern;

import java.util.ArrayList;
import java.util.List;
 
class Order implements Cloneable {
    private String orderId;
    private List<String> productList;
    private String shippingAddress;
 
    public Order(String orderId, List<String> productList, String shippingAddress) {
        this.orderId = orderId;
        this.productList = productList;
        this.shippingAddress = shippingAddress;
    }
 
    public String getOrderId() {
        return orderId;
    }
 
    public List<String> getProductList() {
        return productList;
    }
 
    public String getShippingAddress() {
        return shippingAddress;
    }
    public void setOrderId(String orderId) {
        this.orderId = orderId;
    }

    public void setProductList(List<String> productList) {
        this.productList = productList;
    }

    public void setShippingAddress(String shippingAddress) {
        this.shippingAddress = shippingAddress;
    }

    //浅拷贝
//    @Override
//    public Order clone() throws CloneNotSupportedException {
//        return new Order(orderId, productList, shippingAddress);
//    }
    //深拷贝
     @Override
     public Order clone() throws CloneNotSupportedException {
         // 创建新的订单对象
         Order clonedOrder = (Order) super.clone();

         // 深拷贝商品列表
         List<String> clonedProductList = new ArrayList<>();
         for (String product : productList) {
             clonedProductList.add(product);
         }
         clonedOrder.setProductList(clonedProductList);

         return clonedOrder;
     }

}
 