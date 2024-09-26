package designMode.action.ChainOfResponsibility;

// 验证处理器
class ValidationHandler extends Handler {
    @Override
    public void handleRequest(Request request) {
        // 进行退货申请的验证逻辑
        // ...
 
        if (request.isValid()) {
            System.out.println("Return request is valid.");
            if (successor != null) {
                successor.handleRequest(request);
            }
        } else {
            System.out.println("Return request is invalid.");
        }
    }
}
 
// 审核处理器
class ReviewHandler extends Handler {
    @Override
    public void handleRequest(Request request) {
        // 进行退货申请的审核逻辑
        // ...
 
        if (request.isReviewed()) {
            System.out.println("Return request is reviewed.");
            if (successor != null) {
                successor.handleRequest(request);
            }
        } else {
            System.out.println("Return request is not reviewed.");
        }
    }
}
 
// 处理处理器
class ProcessingHandler extends Handler {
    @Override
    public void handleRequest(Request request) {
        // 进行退货申请的处理逻辑
        // ...
 
        System.out.println("Return request is processed.");
    }
}
 