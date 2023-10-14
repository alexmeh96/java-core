package com.mehcoder.patterns.structural.proxy;

public class Main {
    public static void main(String[] args) {
        Account account1 = new SavingAccount();
        account1.countMoney();

        System.out.println();

        Account account2 = new ProxySavingAccount();
        account2.countMoney();
    }
}
