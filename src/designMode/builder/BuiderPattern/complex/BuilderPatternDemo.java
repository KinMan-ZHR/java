package designMode.builder.BuiderPattern.complex;

public class BuilderPatternDemo {
    public static void main(String[] args) {
        Waiter waiter = new Waiter();
        
        MealBuilder vegBuilder = new VegMealBuilder();
        waiter.setMealBuilder(vegBuilder);
        waiter.constructMeal();
        Meal vegMeal = waiter.getMeal();
        System.out.println("Veg Meal: " + vegMeal);

        MealBuilder nonVegBuilder = new NonVegMealBuilder();
        waiter.setMealBuilder(nonVegBuilder);
        waiter.constructMeal();
        Meal nonVegMeal = waiter.getMeal();
        System.out.println("Non-Veg Meal: " + nonVegMeal);
    }
}