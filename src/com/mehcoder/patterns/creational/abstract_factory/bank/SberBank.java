package com.mehcoder.patterns.creational.abstract_factory.bank;

public class SberBank implements Bank {
    @Override
    public void bankName() {
        System.out.println("This is SberBank");
    }
}
