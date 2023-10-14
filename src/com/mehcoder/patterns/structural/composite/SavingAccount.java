package com.mehcoder.patterns.structural.composite;

public class SavingAccount implements Account {

    private long savingMoney;

    public SavingAccount(long money) {
        this.savingMoney = money;
    }

    @Override
    public long countMoney() {
        return savingMoney;
    }
}