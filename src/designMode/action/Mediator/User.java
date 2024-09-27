package designMode.action.Mediator;

public interface User {
    void setMediator(ChatMediator mediator);

    void send(String message);
    void receive(String message);
}
