package com.mehcoder.patterns.structural.bridge;

public class TinkoffBank extends Bank {

    public TinkoffBank(Account account) {
        super(account);
    }

    @Override
    Account openAccount() {
        System.out.println("Open your account with TinkoffBank");
        return account;
    }
}