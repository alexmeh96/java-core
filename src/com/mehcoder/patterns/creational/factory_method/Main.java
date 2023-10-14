package com.mehcoder.patterns.creational.factory_method;

public class Main {
    public static void main(String[] args) {
        AccountFactory factory = new AccountFactory();

        Account savingAccount = factory.getAccount("SAVING");
        savingAccount.accountType();

        Account currentAccount = factory.getAccount("CURRENT");
        currentAccount.accountType();
    }
}
