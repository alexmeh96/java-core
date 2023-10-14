package com.mehcoder.core.multithreading.atomic;

public class SynchronizedCounter implements Runnable {
    private int counter = 0;

    int getValue() {
        return counter;
    }

    synchronized void increment() {
        counter++;
    }

    @Override
    public void run() {
        for (int i = 0; i < 1000; i++) {
            increment();
        }
    }
}
