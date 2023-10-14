package com.mehcoder.patterns.structural.proxy;

public class SavingAccount implements Account {

    @Override
    public void countMoney() {
        System.out.println("countMoney");
    }
}