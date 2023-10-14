package com.mehcoder.patterns.creational.singleton;

// синглтон-объект создаётся заранее
public class SingletonEager {
    private static final SingletonEager INSTANCE = new SingletonEager();

    private SingletonEager() {}

    public static SingletonEager getInstance() {
        return INSTANCE;
    }
}
