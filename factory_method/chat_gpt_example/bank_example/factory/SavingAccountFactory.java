package factory_method.chat_gpt_example.bank_example.factory;

import factory_method.chat_gpt_example.bank_example.account.Account;
import factory_method.chat_gpt_example.bank_example.account.impl.SavingAccount;

public class SavingAccountFactory extends AccountFactory {
    @Override
    public Account createAccount() {
        return new SavingAccount();
    }
}