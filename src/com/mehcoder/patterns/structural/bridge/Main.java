package com.mehcoder.patterns.structural.bridge;

public class Main {
    public static void main(String[] args) {
        Bank tinkoffBank = new TinkoffBank(new CurrentAccount());
        Account current = tinkoffBank.openAccount();
        current.accountType();

        System.out.println();

        Bank sberBank = new SberBank(new SavingAccount());
        Account saving = sberBank.openAccount();
        saving.accountType();
    }
}
