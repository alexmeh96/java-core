package com.mehcoder.core.multithreading.atomic;

public class Counter implements Runnable {
    private int counter = 0;

    int getValue() {
        return counter;
    }

    void increment() {
        counter++;
    }


    @Override
    public void run() {
        for (int i = 0; i < 1000; i++) {
            increment();
        }
    }
}
