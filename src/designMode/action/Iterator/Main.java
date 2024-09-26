package designMode.action.Iterator;

public class Main {
    public static void main(String[] args) {
        ProductList productList = new ProductList();
        productList.addProduct("Product 1");
        productList.addProduct("Product 2");
        productList.addProduct("Product 3");
 
        Iterator iterator = productList;
 
        while (iterator.hasNext()) {
            String product = (String) iterator.next();
            System.out.println("Product: " + product);
        }
    }
}
 