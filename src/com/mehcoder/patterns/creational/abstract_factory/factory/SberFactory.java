package com.mehcoder.patterns.creational.abstract_factory.factory;

import com.mehcoder.patterns.creational.abstract_factory.account.Account;
import com.mehcoder.patterns.creational.abstract_factory.account.SberAccount;
import com.mehcoder.patterns.creational.abstract_factory.bank.Bank;
import com.mehcoder.patterns.creational.abstract_factory.bank.SberBank;

public class SberFactory implements AbstractFactory {
    @Override
    public Bank getBank() {
        return new SberBank();
    }

    @Override
    public Account getAccount() {
        return new SberAccount();
    }
}
