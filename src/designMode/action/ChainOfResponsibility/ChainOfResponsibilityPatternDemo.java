package designMode.action.ChainOfResponsibility;

public class ChainOfResponsibilityPatternDemo {
    public static void main(String[] args) {
        // 创建处理者

        Handler validationHandler = new ValidationHandler();
        Handler reviewHandler = new ReviewHandler();
        Handler processingHandler = new ProcessingHandler();

        validationHandler.setSuccessor(reviewHandler);
        reviewHandler.setSuccessor(processingHandler);

        Request request = new Request("Type1", "Data for Type1");
        validationHandler.handleRequest(request);

    }
}