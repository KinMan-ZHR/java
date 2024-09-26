package designMode.builder.BuiderPattern.complex;

public class VegMealBuilder extends MealBuilder {

    @Override
    public void buildBurger() {
        meal.setBurger("Veg Burger");
    }

    @Override
    public void buildDrink() {
        meal.setDrink("Coke");
    }

    // 实现其他 buildXXX 方法...
}

