package com.mehcoder.patterns.creational.singleton;

// синглтон-объект создаётся при первом вызове метода getInstance()
public class SingletonLazy {
    private static SingletonLazy instance = null;

    private SingletonLazy() {
    }

    public static SingletonLazy getInstance() {
        if (instance == null) {
            synchronized(SingletonLazy.class){
                if (instance == null) {
                    instance = new SingletonLazy();
                }
            }
        }
        return instance;
    }
}
