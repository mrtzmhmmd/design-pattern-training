package observer.chat_gpt_example;

public class ConcreteInvestor implements Observer {
    private final String name;

    public ConcreteInvestor(String name) {
        this.name = name;
    }

    @Override
    public void update(double stockPrice) {
        System.out.println(name
                + " received notification: Stock price changed to "
                + stockPrice);
    }
}