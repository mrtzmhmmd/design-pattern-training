package observer.com.journaldev.design.observer;

import java.util.ArrayList;
import java.util.List;

public class MyTopic implements Subject {
    private final List<Observer> observers;
    private String message;
    private boolean changed;
    private final Object MUTEX = new Object();

    public MyTopic() {
        this.observers = new ArrayList<>();
    }

    @Override
    public void register(Observer observer) {
        if(observer == null) {
            throw new NullPointerException("Null Observer");
        }
        synchronized (MUTEX) {
            if(!observers.contains(observer)) {
                observers.add(observer);
            }
        }
    }

    @Override
    public void unregister(Observer observer) {
        synchronized (MUTEX) {
            observers.remove(observer);
        }
    }

    @Override
    public void notifyObservers() {
        List<Observer> observersLocal;
        synchronized (MUTEX) {
            if(!changed) {
                return;
            }
            observersLocal = new ArrayList<>(this.observers);
            this.changed = false;
        }
        for(Observer observer: observersLocal) {
            observer.update();
        }
    }

    @Override
    public Object getUpdate(Observer obj) {
        return this.message;
    }

    public void postMessage(String msg) {
        System.out.println("Message Posted to Topic: " + msg);
        this.message = msg;
        this.changed = true;
        notifyObservers();
    }
}
