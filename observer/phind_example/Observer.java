package observer.phind_example;

public abstract class Observer {
    protected Subject subject;
    public abstract void update();
}
