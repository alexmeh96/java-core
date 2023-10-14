package com.mehcoder.patterns.creational.singleton;

public class Main {
    public static void main(String[] args) {
        SingletonEager instanceEager1 = SingletonEager.getInstance();
        SingletonEager instanceEager2 = SingletonEager.getInstance();
        System.out.println("instanceEager1: " + instanceEager1);
        System.out.println("instanceEager2: " + instanceEager2);

        System.out.println();

        SingletonLazy instanceLazy1 = SingletonLazy.getInstance();
        SingletonLazy instanceLazy2 = SingletonLazy.getInstance();
        System.out.println("instanceLazy1: " + instanceLazy1);
        System.out.println("instanceLazy2: " + instanceLazy2);
    }
}
