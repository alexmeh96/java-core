package com.mehcoder.patterns.structural.proxy;

public class ProxySavingAccount implements Account{
    private Account savingAccount;

    public ProxySavingAccount() {
        this.savingAccount = new SavingAccount();
    }

    public void countMoney() {
        System.out.println("log start");
        savingAccount.countMoney();
        System.out.println("log finish");
    }
}
