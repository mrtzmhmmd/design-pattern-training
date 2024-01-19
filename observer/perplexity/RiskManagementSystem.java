package observer.perplexity;

public class RiskManagementSystem implements Observer {
    @Override
    public void update(double price) {
        System.out.println("Risk Management System received stock price update: " + price);
    }
}