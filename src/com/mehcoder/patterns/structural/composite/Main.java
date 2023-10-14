package com.mehcoder.patterns.structural.composite;

public class Main {
    public static void main(String[] args) {
        SavingAccount savingAccount1 = new SavingAccount(3);
        SavingAccount savingAccount2 = new SavingAccount(8);

        CurrentAccount currentAccount1 = new CurrentAccount(5);
        CurrentAccount currentAccount2 = new CurrentAccount(0);

        CompositeBankAccount compositeBankAccount1 = new CompositeBankAccount();
        CompositeBankAccount compositeBankAccount2 = new CompositeBankAccount();
        CompositeBankAccount compositeBankAccount = new CompositeBankAccount();

        // Выполняем композицию банковских счетов
        compositeBankAccount1.add(savingAccount1);
        compositeBankAccount1.add(currentAccount1);
        compositeBankAccount2.add(currentAccount2);
        compositeBankAccount2.add(savingAccount2);
        compositeBankAccount.add(compositeBankAccount2);
        compositeBankAccount.add(compositeBankAccount1);

        System.out.println("Total money: " + compositeBankAccount.countMoney());
    }
}
