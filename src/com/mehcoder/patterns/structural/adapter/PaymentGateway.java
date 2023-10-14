package com.mehcoder.patterns.structural.adapter;

public interface PaymentGateway {
    void doPayment(Account account1, Account account2);
}
