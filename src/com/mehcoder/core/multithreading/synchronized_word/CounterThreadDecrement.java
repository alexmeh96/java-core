package com.mehcoder.core.multithreading.synchronized_word;

public class CounterThreadDecrement extends Thread {

    private final Counter counter;

    public CounterThreadDecrement(Counter counter) {
        this.counter = counter;
    }

    @Override
    public void run() {
        for (int i = 0; i < 1000; i++) {
            counter.decrement();
        }
    }
}