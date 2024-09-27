package designMode.action.interpreter;

public class InterpreterPatternDemo {
    public static void main(String[] args) {
        // 创建表达式树
        Expression expression = new AddExpression(
            new SubtractExpression(
                new NumberExpression(10),
                new NumberExpression(5)
            ),
            new NumberExpression(2)
        );

        // 解析并计算表达式
        int result = expression.interpret();
        System.out.println("Result: " + result);  // 输出: Result: 7
    }
}