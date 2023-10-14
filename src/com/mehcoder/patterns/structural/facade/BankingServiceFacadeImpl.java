package com.mehcoder.patterns.structural.facade;

import com.mehcoder.patterns.structural.facade.service.AccountService;
import com.mehcoder.patterns.structural.facade.service.PaymentService;
import com.mehcoder.patterns.structural.facade.service.TransferService;

public class BankingServiceFacadeImpl implements BankingServiceFacade {
    @Override
    public void moneyTransfer() {
        if(PaymentService.doPayment()){
            Account fromAccount = AccountService.getAccount("1");
            Account toAccount = AccountService.getAccount("2");
            TransferService.transfer(1000, fromAccount, toAccount);
        }
    }
}
