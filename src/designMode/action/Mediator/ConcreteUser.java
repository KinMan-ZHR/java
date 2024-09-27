package designMode.action.Mediator;

public class ConcreteUser implements User {
    private final String name;
    private ChatMediator mediator;

    public ConcreteUser(String name) {
        this.name = name;
    }
    @Override
    public void setMediator(ChatMediator mediator) {
        this.mediator = mediator;
    }

    @Override
    public void send(String message) {
        System.out.println(name + " sends: " + message);
        mediator.sendMessage(message, this);
    }

    @Override
    public void receive(String message) {
        System.out.println(name + " receives: " + message);
    }
}