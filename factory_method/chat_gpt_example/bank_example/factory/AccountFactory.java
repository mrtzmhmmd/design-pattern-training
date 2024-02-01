package factory_method.chat_gpt_example.bank_example.factory;

import factory_method.chat_gpt_example.bank_example.account.Account;

public abstract class AccountFactory {
    public abstract Account createAccount();
}