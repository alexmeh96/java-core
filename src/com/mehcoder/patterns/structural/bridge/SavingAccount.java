package com.mehcoder.patterns.structural.bridge;

public class SavingAccount implements Account {

    @Override
    public void accountType() {
        System.out.println("It's a SAVING Account");
    }
}