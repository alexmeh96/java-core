package com.mehcoder.patterns.structural.bridge;

public abstract class Bank {
    protected Account account;

    // мост, который соединяет разные реализации Account с разными реализациями Bank через композицию
    public Bank(Account account){
        this.account = account;
    }

    abstract Account openAccount();
}
