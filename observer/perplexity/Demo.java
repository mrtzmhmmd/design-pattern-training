package observer.perplexity;

public class Demo {
    public static void main(String[] args) {
        StockData stockData = new StockData();
        TradingAlgorithm tradingAlgorithm = new TradingAlgorithm();
        RiskManagementSystem riskManagementSystem = new RiskManagementSystem();
        stockData.registerObserver(tradingAlgorithm);
        stockData.registerObserver(riskManagementSystem);
        stockData.setStockPrice(100.00);
    }
}