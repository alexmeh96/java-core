package com.mehcoder.core.multithreading.atomic;

public class Main {
    public static void main(String[] args) throws InterruptedException {
        counterTest();
        safeCounterTest();
        synchronizedCounterTest();
    }


    private static void synchronizedCounterTest() throws InterruptedException {
        SynchronizedCounter safeCounter = new SynchronizedCounter();
        Thread threadCounter1 = new Thread(safeCounter);
        Thread threadCounter2 = new Thread(safeCounter);
        Thread threadCounter3 = new Thread(safeCounter);
        Thread threadCounter4 = new Thread(safeCounter);

        threadCounter1.start();
        threadCounter2.start();
        threadCounter3.start();
        threadCounter4.start();

        threadCounter1.join();
        threadCounter2.join();
        threadCounter3.join();
        threadCounter4.join();

        System.out.println("synchronizedCounter = " + safeCounter.getValue());
    }

    private static void safeCounterTest() throws InterruptedException {
        SafeCounter safeCounter = new SafeCounter();
        Thread threadCounter1 = new Thread(safeCounter);
        Thread threadCounter2 = new Thread(safeCounter);
        Thread threadCounter3 = new Thread(safeCounter);
        Thread threadCounter4 = new Thread(safeCounter);

        threadCounter1.start();
        threadCounter2.start();
        threadCounter3.start();
        threadCounter4.start();

        threadCounter1.join();
        threadCounter2.join();
        threadCounter3.join();
        threadCounter4.join();

        System.out.println("safeCounter = " + safeCounter.getValue());
    }

    private static void counterTest() throws InterruptedException {
        Counter counter = new Counter();
        Thread threadCounter1 = new Thread(counter);
        Thread threadCounter2 = new Thread(counter);
        Thread threadCounter3 = new Thread(counter);
        Thread threadCounter4 = new Thread(counter);

        threadCounter1.start();
        threadCounter2.start();
        threadCounter3.start();
        threadCounter4.start();

        threadCounter1.join();
        threadCounter2.join();
        threadCounter3.join();
        threadCounter4.join();

        System.out.println("counter = " + counter.getValue());
    }
}
