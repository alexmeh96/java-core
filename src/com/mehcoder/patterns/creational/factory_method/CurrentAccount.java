package com.mehcoder.patterns.creational.factory_method;

public class CurrentAccount implements Account{
    @Override
    public void accountType() {
        System.out.println("this is CurrentAccount");
    }
}
