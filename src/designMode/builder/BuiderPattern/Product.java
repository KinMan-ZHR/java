package designMode.builder.BuiderPattern;

public class Product {
    private final String name;
    private final double price;
    private final String description;
    private final int stock;
 
    private Product(Builder builder) {
        this.name = builder.name;
        this.price = builder.price;
        this.description = builder.description;
        this.stock = builder.stock;
    }
 
    public String getName() {
        return name;
    }
 
    public double getPrice() {
        return price;
    }
 
    public String getDescription() {
        return description;
    }
 
    public int getStock() {
        return stock;
    }
 
    public static class Builder {
        private final String name;
        private final double price;
        private String description;
        private int stock;
 
        public Builder(String name, double price) {
            this.name = name;
            this.price = price;
        }
 
        public Builder setDescription(String description) {
            this.description = description;
            return this;
        }
 
        public Builder setStock(int stock) {
            this.stock = stock;
            return this;
        }
 
        public Product build() {
            return new Product(this);
        }
    }
}
 
 