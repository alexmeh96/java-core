package com.mehcoder.patterns.structural.adapter;

public class AdvancedPaymentGatewayAdapter implements AdvancedPayGateway {
    private PaymentGateway paymentGateway;

    public AdvancedPaymentGatewayAdapter(PaymentGateway paymentGateway) {
        this.paymentGateway = paymentGateway;
    }

    public void makePayment(String mobile1, String mobile2) {
        // здесь можно сделать логику получения аккаунтов по номерам телефона
        Account account1 = null;
        Account account2 = null;
        paymentGateway.doPayment(account1, account2);
    }
}