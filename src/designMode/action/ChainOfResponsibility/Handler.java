package designMode.action.ChainOfResponsibility;

// 抽象处理器
abstract class Handler {
    protected Handler successor;
 
    public void setSuccessor(Handler successor) {
        this.successor = successor;
    }
 
    public abstract void handleRequest(Request request);
}
 