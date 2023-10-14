package com.mehcoder.patterns.creational.factory_method;

public class SavingAccount implements Account{
    @Override
    public void accountType() {
        System.out.println("This is SavingAccount");
    }
}
