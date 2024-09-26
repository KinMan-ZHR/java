package designMode.builder.BuiderPattern;

public class Main {
    public static void main(String[] args) {
        Product product = new Product.Builder("iPhone", 999.99)
                .setDescription("The latest iPhone model")
                .setStock(100)
                .build();
                
        System.out.println("Product Name: " + product.getName());
        System.out.println("Price: $" + product.getPrice());
        System.out.println("Description: " + product.getDescription());
        System.out.println("Stock: " + product.getStock());
    }
}
 