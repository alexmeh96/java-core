package com.mehcoder.patterns.creational.prototype;

public class CurrentAccount implements Account {

    private String name = "";
    private User user;

    public CurrentAccount(String name, String username) {
        this.name = name;
        this.user = new User(username);
    }

    @Override
    public String accountType() {
        return name + " account | user: " + user.getName();
    }

    @Override
    public CurrentAccount clone() {
        try {
            CurrentAccount account = (CurrentAccount) super.clone();
            // если не создать новый объект, то в поле user будет одна и та же ссылка как у прототипа, так и у исходного объекта
            account.user = this.user.clone();
            return account;
        } catch (CloneNotSupportedException e) {
            throw new AssertionError();
        }
    }

    @Override
    public String toString() {
        return "CurrentAccount{" +
               "name='" + name + '\'' +
               ", user=" + user +
               '}';
    }
}