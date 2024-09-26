package designMode.action.templateMethod;

public class TemplateMethodPatternDemo {
    public static void main(String[] args) {
        CaffeineBeverage coffee = new Coffee();
        coffee.prepareRecipe();

        System.out.println("\n");

        CaffeineBeverage tea = new Tea();
        tea.prepareRecipe();
    }
}