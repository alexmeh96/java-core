package com.mehcoder.patterns.structural.adapter;

public class Main {
    public static void main(String[] args) {
        PaymentGateway paymentGateway = new PaymentGatewayImpl();
        AdvancedPayGateway advancedPayGateway = new AdvancedPaymentGatewayAdapter(paymentGateway);
        String mobile1 = "mobile1";
        String mobile2 = "mobile2";
        advancedPayGateway.makePayment(mobile1, mobile2);
    }
}
