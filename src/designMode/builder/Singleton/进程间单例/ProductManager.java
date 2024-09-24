package designMode.builder.Singleton.进程间单例;

import designMode.Product;

import java.util.ArrayList;
import java.util.List;

public class ProductManager {
    private static final ThreadLocal<ProductManager> INSTANCE = new ThreadLocal<ProductManager>() {
        @Override
        protected ProductManager initialValue() {
            return new ProductManager();
        }
    };
 
    private final List<Product> products;
 
    private ProductManager() {
        products = new ArrayList<>();
    }
 
    public static ProductManager getInstance() {
        return INSTANCE.get();
    }
 
    public void addProduct(Product product) {
        products.add(product);
    }
 
    public void removeProduct(Product product) {
        products.remove(product);
    }
 
    public void displayProducts() {
        System.out.println("Product List:");
        for (Product product : products) {
            System.out.println("- " + product.getName());
        }
    }
}
 