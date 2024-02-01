package factory_method.chat_gpt_example.bank_example;

import factory_method.chat_gpt_example.bank_example.account.Account;
import factory_method.chat_gpt_example.bank_example.factory.AccountFactory;
import factory_method.chat_gpt_example.bank_example.factory.CheckingAccountFactory;
import factory_method.chat_gpt_example.bank_example.factory.SavingAccountFactory;

public class Main {
    public static void main(String[] args) {
        AccountFactory savingsFactory = new SavingAccountFactory();
        Account savingsAccount = savingsFactory.createAccount();
        savingsAccount.deposit(1000);
        savingsAccount.withdraw(500);
        System.out.println("Saving Account Balance: " + savingsAccount.getBalance());

        AccountFactory checkingFactory = new CheckingAccountFactory();
        Account checkingAccount = checkingFactory.createAccount();
        checkingAccount.deposit(1000);
        checkingAccount.withdraw(1500);
        System.out.println("Checking Account Balance: " + checkingAccount.getBalance());
    }
}
