package com.mehcoder.patterns.structural.bridge;

public class CurrentAccount implements Account {

    @Override
    public void accountType() {
        System.out.println("It's a CURRENT Account");
    }
}