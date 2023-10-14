package com.mehcoder.patterns.structural.bridge;

public class SberBank extends Bank {

    public SberBank(Account account) {
        super(account);
    }

    @Override
    Account openAccount() {
        System.out.println("Open your account with SberBank");
        return account;
    }
}