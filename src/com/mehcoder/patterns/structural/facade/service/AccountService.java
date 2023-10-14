package com.mehcoder.patterns.structural.facade.service;

import com.mehcoder.patterns.structural.facade.Account;
import com.mehcoder.patterns.structural.facade.SavingAccount;

public class AccountService {
    public static Account getAccount(String accountId) {
        return new SavingAccount();
    }
}
