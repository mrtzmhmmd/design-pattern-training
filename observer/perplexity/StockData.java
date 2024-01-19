package observer.perplexity;

import java.util.ArrayList;
import java.util.List;

public class StockData {
    private final List<Observer> observers = new ArrayList<>();
    private double stockPrice;

    public void registerObserver(Observer observer) {
        observers.add(observer);
    }

    public void unregisteredObserver(Observer observer) {
        observers.remove(observer);
    }

    public void notifyObservers() {
        for(Observer observer : observers) {
            observer.update(stockPrice);
        }
    }

    public void setStockPrice(double price) {
        this.stockPrice = price;
        notifyObservers();
    }
}
