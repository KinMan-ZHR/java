package designMode.builder.Singleton;

import designMode.Product;

import java.util.ArrayList;
import java.util.List;

public class ProductManager {


    private final List<Product> products;
 // 构造函数私有化
    private ProductManager() {
        products = new ArrayList<>();
    }
 // 双重检查锁定实现懒加载防多线程问题
//    private static volatile ProductManager instance;
//    public static ProductManager getInstance() {
//        if (instance == null) {
//            synchronized (ProductManager.class) {
//                if (instance == null) {
//                    instance = new ProductManager();
//                }
//            }
//        }
//        return instance;
//    }
 // 静态内部类实现懒加载
 private static class SingletonHolder {
     private static final ProductManager instance = new ProductManager();
 }
    public static ProductManager getInstance() {
        return SingletonHolder.instance;
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
 