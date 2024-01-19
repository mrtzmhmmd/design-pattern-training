package observer.chat_gpt_example;

public class ObserverPatternsDemo {
    public static void main(String[] args) {
        ConcreteStock appleStock = new ConcreteStock("APPL", 150.0);
        ConcreteStock amdStock = new ConcreteStock("AMD", 130.0);

        ConcreteInvestor investor1 = new ConcreteInvestor("John");
        ConcreteInvestor investor2 = new ConcreteInvestor("Alice");
        ConcreteInvestor investor3 = new ConcreteInvestor("David");

        appleStock.addObserver(investor1);
        appleStock.addObserver(investor2);

        amdStock.addObserver(investor2);
        amdStock.addObserver(investor3);

        appleStock.setPrice(155.0);
        amdStock.setPrice(125.0);

        appleStock.removeObserver(investor2);
        appleStock.setPrice(160.0);
    }
}
