package designMode.structure.observer;

public class NewsAgency extends Subject {
    public void publishNews(String news) {
        System.out.println("Publishing news: " + news);
        notifyObservers(news);
    }
}