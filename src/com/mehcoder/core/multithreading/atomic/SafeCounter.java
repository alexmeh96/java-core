package com.mehcoder.core.multithreading.atomic;

import java.util.concurrent.atomic.AtomicInteger;

public class SafeCounter implements Runnable {
    private final AtomicInteger counter = new AtomicInteger(0);

    int getValue() {
        return counter.get();
    }

    void increment() {
        counter.incrementAndGet();
    }


    @Override
    public void run() {
        for (int i = 0; i < 1000; i++) {
            increment();
        }
    }
}
