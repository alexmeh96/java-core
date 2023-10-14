package com.mehcoder.patterns.creational.prototype;

public class Main {
    public static void main(String[] args) {
        Account savingAccount = new SavingAccount("saving");
        Account cloneSavingAccount = savingAccount.clone();
        System.out.println(cloneSavingAccount.accountType());
        System.out.println(savingAccount);
        System.out.println(cloneSavingAccount);

        System.out.println();

        Account currentAccount = new CurrentAccount("current", "user1");
        Account cloneCurrentAccount = currentAccount.clone();
        System.out.println(cloneCurrentAccount.accountType());
        System.out.println(currentAccount);
        System.out.println(cloneCurrentAccount);
    }
}
