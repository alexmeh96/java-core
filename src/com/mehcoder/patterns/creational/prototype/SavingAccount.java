package com.mehcoder.patterns.creational.prototype;

public class SavingAccount implements Account {
    private String name = "";

    public SavingAccount(String name) {
        this.name = name;
    }

    @Override
    public String accountType() {
        return name + " account";
    }
    @Override
    public Account clone() {
        try {
            return (Account) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new AssertionError();
        }
    }
}