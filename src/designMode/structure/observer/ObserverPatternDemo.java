package designMode.structure.observer;

public class ObserverPatternDemo {
    public static void main(String[] args) {
        NewsAgency newsAgency = new NewsAgency();

        // 创建观察者
        NewsSubscriber subscriber1 = new NewsSubscriber("Subscriber 1");
        NewsSubscriber subscriber2 = new NewsSubscriber("Subscriber 2");

        // 注册观察者
        newsAgency.addObserver(subscriber1);
        newsAgency.addObserver(subscriber2);

        // 发布新闻
        newsAgency.publishNews("Breaking news: Something important happened!");

        // 取消注册观察者
        newsAgency.removeObserver(subscriber1);

        // 再次发布新闻
        newsAgency.publishNews("Another breaking news: Another event occurred!");
    }
}