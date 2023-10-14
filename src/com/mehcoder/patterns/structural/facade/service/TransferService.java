package com.mehcoder.patterns.structural.facade.service;

import com.mehcoder.patterns.structural.facade.Account;

public class TransferService {
    public static void transfer(int amount, Account fromAccount, Account toAccount) {
        System.out.println("Transfering Money");
    }
}