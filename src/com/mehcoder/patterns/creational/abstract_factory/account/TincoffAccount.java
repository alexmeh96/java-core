package com.mehcoder.patterns.creational.abstract_factory.account;

public class TincoffAccount implements Account {
    @Override
    public void accountType() {
        System.out.println("This is TincoffAccount");
    }
}
