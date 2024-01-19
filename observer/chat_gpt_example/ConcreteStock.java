package observer.chat_gpt_example;

import java.util.ArrayList;
import java.util.List;

public class ConcreteStock implements Subject {
    private String symbol;
    private double price;
    private final List<Observer> observers = new ArrayList<>();

    public ConcreteStock(String symbol, double price) {
        this.symbol = symbol;
        this.price = price;
    }

    public void setPrice(double price) {
        this.price = price;
        notifyObservers();
    }

    @Override
    public void addObserver(Observer observer) {
        observers.add(observer);
    }

    @Override
    public void removeObserver(Observer observer) {
        observers.remove(observer);
    }

    @Override
    public void notifyObservers() {
        for (Observer observer : observers) {
            observer.update(price);
        }
    }
}