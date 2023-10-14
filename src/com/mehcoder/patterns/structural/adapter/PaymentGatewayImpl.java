package com.mehcoder.patterns.structural.adapter;

public class PaymentGatewayImpl implements PaymentGateway {
    @Override
    public void doPayment(Account account1, Account account2) {
        System.out.println("процесс перевода из account1 в account2");
    }
}