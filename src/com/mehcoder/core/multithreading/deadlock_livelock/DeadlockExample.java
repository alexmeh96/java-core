package com.mehcoder.core.multithreading.deadlock_livelock;

import static java.lang.Thread.sleep;

public class DeadlockExample {

    private final Object lock1 = new Object();
    private final Object lock2 = new Object();

    public static void main(String[] args) {
        DeadlockExample deadlock = new DeadlockExample();
        new Thread(deadlock::operation1, "T1").start();
        new Thread(deadlock::operation2, "T2").start();
    }

    public void operation1() {
        try {
            synchronized (lock1) {
                System.out.println("получен lock1, ожидающий получения lock2");
                sleep(50);
                synchronized (lock2) {
                    System.out.println("получен lock2");

                    System.out.println("выполнение операции operation1");
                }
            }
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }

    public void operation2() {
        try {
            synchronized (lock2) {
                System.out.println("получен lock2, ожидающий получения lock1");
                sleep(50);
                synchronized (lock1) {
                    System.out.println("получен lock1");

                    System.out.println("выполнение операции operation2");
                }
            }
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }

}