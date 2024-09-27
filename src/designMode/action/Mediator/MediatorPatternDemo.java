package designMode.action.Mediator;

public class MediatorPatternDemo {
    public static void main(String[] args) {
        // 创建中介者
        ChatMediator chatMediator = new ConcreteChatMediator();

        // 创建用户
        User user1 = new ConcreteUser("Alice");
        User user2 = new ConcreteUser("Bob");
        User user3 = new ConcreteUser("Charlie");

        // 设置用户的中介者
        user1.setMediator(chatMediator);
        user2.setMediator(chatMediator);
        user3.setMediator(chatMediator);

        // 将用户添加到中介者
        chatMediator.addUser(user1);
        chatMediator.addUser(user2);
        chatMediator.addUser(user3);

        // 用户发送消息
        user1.send("Hello, everyone!");
        user2.send("Hi, Alice!");
        user3.send("Hey, what's up?");
    }
}