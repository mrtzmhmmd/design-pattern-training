package observer.perplexity;

public class TradingAlgorithm implements Observer {
    @Override
    public void update(double price) {
        System.out.println("TradingAlgorithm received stock price update: " + price);
    }
}