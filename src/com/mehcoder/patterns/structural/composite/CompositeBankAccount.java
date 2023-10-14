package com.mehcoder.patterns.structural.composite;

import java.util.ArrayList;
import java.util.List;

public class CompositeBankAccount implements Account {
    // Коллекция счетов-потомков
    private List<Account> childAccounts = new ArrayList<>();

    @Override
    public long countMoney() {
        long sum = 0;
        for (Account account : childAccounts) {
            sum += account.countMoney();
        }
        return sum;
    }

    public void add(Account account) {
        childAccounts.add(account);
    }

    public void remove(Account account) {
        childAccounts.remove(account);
    }
}
