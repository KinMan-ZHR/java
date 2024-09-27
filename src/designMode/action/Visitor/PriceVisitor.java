package designMode.action.Visitor;

import java.util.List;

// 计算订单总价的访问者
class PriceVisitor implements Visitor {
    private double totalPrice;
 
    public void visit(Order order) {
        List<String> products = order.getProducts();
        for (String product : products) {
            // 假设每个商品的价格都为10元
            totalPrice += 10.0;
        }
    }
 
    public double getTotalPrice() {
        return totalPrice;
    }
}
 
// 统计特定商品数量的访问者
class CountVisitor implements Visitor {
    private int totalCount;
 
    public void visit(Order order) {
        List<String> products = order.getProducts();
        for (String product : products) {
            if (product.equals("iPhone")) {
                totalCount++;
            }
        }
    }
 
    public int getTotalCount() {
        return totalCount;
    }
}
 