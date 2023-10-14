package com.mehcoder.patterns.structural.composite;

public class CurrentAccount implements Account {

    private long currentMoney;

    public CurrentAccount(long money) {
        this.currentMoney = money;
    }

    @Override
    public long countMoney() {
        return currentMoney;
    }
}