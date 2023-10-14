package com.mehcoder.patterns.creational.factory_method;

public class AccountFactory {
    private final String CURRENT_ACCOUNT = "CURRENT";
    private final String SAVING_ACCOUNT = "SAVING";

    // фабричный метод, который создаёт нужный нам объект
    public Account getAccount(String accountType) {
        if (CURRENT_ACCOUNT.equals(accountType)) {
            return new CurrentAccount();
        }
        if (SAVING_ACCOUNT.equals(accountType)) {
            return new SavingAccount();
        }
        throw new RuntimeException();
    }
}
