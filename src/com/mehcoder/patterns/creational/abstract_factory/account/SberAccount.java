package com.mehcoder.patterns.creational.abstract_factory.account;

public class SberAccount implements Account {
    @Override
    public void accountType() {
        System.out.println("This is SberAccount");
    }
}
