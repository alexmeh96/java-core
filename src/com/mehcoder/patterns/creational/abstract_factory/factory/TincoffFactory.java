package com.mehcoder.patterns.creational.abstract_factory.factory;

import com.mehcoder.patterns.creational.abstract_factory.account.Account;
import com.mehcoder.patterns.creational.abstract_factory.account.TincoffAccount;
import com.mehcoder.patterns.creational.abstract_factory.bank.Bank;
import com.mehcoder.patterns.creational.abstract_factory.bank.TinkoffBank;

public class TincoffFactory implements AbstractFactory {
    @Override
    public Bank getBank() {
        return new TinkoffBank();
    }

    @Override
    public Account getAccount() {
        return new TincoffAccount();
    }
}
