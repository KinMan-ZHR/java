package designMode.builder.BuiderPattern.complex;

public class Waiter {
    private MealBuilder mealBuilder;

    public void setMealBuilder(MealBuilder mb) {
        mealBuilder = mb;
    }

    public Meal getMeal() {
        return mealBuilder.getMeal();
    }

    public void constructMeal() {
        mealBuilder.createNewMealProduct();
        mealBuilder.buildBurger();
        mealBuilder.buildDrink();
        // 调用更多的 buildXXX 方法...
    }
}