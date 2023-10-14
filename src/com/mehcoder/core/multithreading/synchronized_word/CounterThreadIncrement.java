package com.mehcoder.core.multithreading.synchronized_word;

public class CounterThreadIncrement extends Thread {

    private final Counter counter;

    public CounterThreadIncrement(Counter counter) {
        this.counter = counter;
    }

    @Override
    public void run() {
        for (int i = 0; i < 1000; i++) {
            counter.increment();
        }
    }
}