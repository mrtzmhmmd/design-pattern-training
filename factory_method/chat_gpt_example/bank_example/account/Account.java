package factory_method.chat_gpt_example.bank_example.account;

public interface Account {
    void deposit(double amount);

    void withdraw(double amount);

    double getBalance();
}