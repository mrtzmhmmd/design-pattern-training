package factory_method.chat_gpt_example.bank_example.factory;

import factory_method.chat_gpt_example.bank_example.account.Account;
import factory_method.chat_gpt_example.bank_example.account.impl.CheckingAccount;

public class CheckingAccountFactory extends AccountFactory {
    @Override
    public Account createAccount() {
        return new CheckingAccount();
    }
}