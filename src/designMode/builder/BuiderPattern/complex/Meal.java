package designMode.builder.BuiderPattern.complex;

public class Meal {
    private String burger;
    private String drink;
    // 可以有更多其他的食物项...

    public void setBurger(String burger) {
        this.burger = burger;
    }

    public void setDrink(String drink) {
        this.drink = drink;
    }

    // 其他 setter 方法...
    
    @Override
    public String toString() {
        return "Meal{" +
                "burger='" + burger + '\'' +
                ", drink='" + drink + '\'' +
                // 更多其他的食物项...
                '}';
    }
}