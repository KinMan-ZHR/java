package designMode.action.templateMethod;

public abstract class CaffeineBeverage {
    // 模板方法
    final void prepareRecipe() {
        boilWater();
        brew();
        pourInCup();
        if (customerWantsCondiments()) {
            addCondiments();
        }
    }

    // 具体方法
    private void boilWater() {
        System.out.println("Boiling water");
    }

    private void pourInCup() {
        System.out.println("Pouring into cup");
    }

    // 抽象方法
    protected abstract void brew();

    protected abstract void addCondiments();

    // 钩子方法
    protected boolean customerWantsCondiments() {
        return true;  // 默认返回 true，子类可以覆盖此方法
    }
}