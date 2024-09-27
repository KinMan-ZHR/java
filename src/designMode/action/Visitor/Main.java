package designMode.action.Visitor;

import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        List<String> products = new ArrayList<>();
        products.add("iPhone");
        products.add("iPad");
        products.add("MacBook");
 
        Order order = new Order("123456", products);
 
        Visitor priceVisitor = new PriceVisitor();
        order.accept(priceVisitor);
        System.out.println("Total Price: " + ((PriceVisitor) priceVisitor).getTotalPrice());
 
        Visitor countVisitor = new CountVisitor();
        order.accept(countVisitor);
        System.out.println("Total Count of iPhone: " + ((CountVisitor) countVisitor).getTotalCount());
    }
}
 