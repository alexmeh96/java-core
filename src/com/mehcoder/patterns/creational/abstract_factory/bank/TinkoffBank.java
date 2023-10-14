package com.mehcoder.patterns.creational.abstract_factory.bank;

public class TinkoffBank implements Bank {
    @Override
    public void bankName() {
        System.out.println("This is TinkoffBank");
    }
}
