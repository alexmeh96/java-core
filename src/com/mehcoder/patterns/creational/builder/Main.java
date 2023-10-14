package com.mehcoder.patterns.creational.builder;

public class Main {
    public static void main(String[] args) {
        Account account = new Account.AccountBuilder("accountName1", "accountHolder2", 1L)
                .type("type1")
                .balance(2.0)
                .build();
        System.out.println(account);
    }
}
