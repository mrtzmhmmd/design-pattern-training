package observer.phind_example;

public class ObserverPatternDemo {
    public static void main(String[] args) {
        Subject subject = new Subject();
        new HexaObserver(subject);
        new OctalObserver(subject);
        new BinaryObserver(subject);
        for(int i = 0; i < 100; i++) {
            System.out.println(i);
            subject.setState(i);
        }
    }
}
