package designMode.builder.BuiderPattern.complex;

public class NonVegMealBuilder extends MealBuilder {

    @Override
    public void buildBurger() {
        meal.setBurger("Chicken Burger");
    }

    @Override
    public void buildDrink() {
        meal.setDrink("Pepsi");
    }

    // 实现其他 buildXXX 方法...
}
