package com.mehcoder.patterns.creational.abstract_factory.factory;

import com.mehcoder.patterns.creational.abstract_factory.account.Account;
import com.mehcoder.patterns.creational.abstract_factory.bank.Bank;

public interface AbstractFactory {
    Bank getBank();
    Account getAccount();
}
