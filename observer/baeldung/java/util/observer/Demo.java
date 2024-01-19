package observer.baeldung.java.util.observer;

public class Demo {
    public static void main(String[] args) {
        PLCNewsAgency observable = new PLCNewsAgency();
        PLCNewsChannel observer1 = new PLCNewsChannel();
        PLCNewsChannel observer2 = new PLCNewsChannel();
        observable.addPropertyChangeListener(observer1);
        observable.addPropertyChangeListener(observer2);
        observable.setNews("news");
        System.out.println(observer1.getNews());
        System.out.println(observer2.getNews());
        observable.removePropertyChangeListener(observer2);
        observable.setNews("news2");
        System.out.println(observer1.getNews());
        System.out.println(observer2.getNews());
    }
}
