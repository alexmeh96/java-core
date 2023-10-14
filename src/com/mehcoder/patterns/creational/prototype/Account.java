package com.mehcoder.patterns.creational.prototype;

public interface Account extends Cloneable {
    String accountType();
    Account clone();
}
