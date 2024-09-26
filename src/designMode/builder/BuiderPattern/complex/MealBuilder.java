package designMode.builder.BuiderPattern.complex;

public abstract class MealBuilder {
    protected Meal meal;

    public Meal getMeal() {
        return meal;
    }

    public void createNewMealProduct() {
        meal = new Meal();
    }

    public abstract void buildBurger();
    public abstract void buildDrink();
    // 可以有更多的 buildXXX 方法...
}