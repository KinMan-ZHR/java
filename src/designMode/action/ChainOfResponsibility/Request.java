package designMode.action.ChainOfResponsibility;

public class Request {
    private String type;
    private Object data;

    public Request(String type, Object data) {
        this.type = type;
        this.data = data;
    }

    public String getType() {
        return type;
    }

    public Object getData() {
        return data;
    }

    public boolean isReviewed() {
        return true;
    }
    public boolean isProcessed() {
        return true;
    }

    public boolean isValid() {
        return true;
    }
}