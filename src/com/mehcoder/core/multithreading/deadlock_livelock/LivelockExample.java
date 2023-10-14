package com.mehcoder.core.multithreading.deadlock_livelock;

import java.util.concurrent.TimeUnit;
import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReentrantLock;

import static java.lang.Thread.sleep;

public class LivelockExample {

    private final Lock lock1 = new ReentrantLock(true);
    private final Lock lock2 = new ReentrantLock(true);

    public static void main(String[] args) {
        LivelockExample livelock = new LivelockExample();
        new Thread(livelock::operation1, "T1").start();
        new Thread(livelock::operation2, "T2").start();
    }

    public void operation1() {
        try {
            while (true) {
                // захват блокировки в течении 50мс
                lock1.tryLock(50, TimeUnit.MILLISECONDS);
                System.out.println("получен lock1, попытка получить lock2.");
                sleep(50);

                // захват блокировки и возврат удачно/неудачно
                if (lock2.tryLock()) {
                    System.out.println("получен lock2");
                } else {
                    System.out.println("не удаётся получить lock2, снимаем lock1");
                    // оставить блокировку
                    lock1.unlock();
                    continue;
                }

                System.out.println("выполнение операции operation1");
                break;
            }
            lock2.unlock();
            lock1.unlock();
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }

    public void operation2() {
        try {
            while (true) {
                // захват блокировки в течении 50мс
                lock2.tryLock(50, TimeUnit.MILLISECONDS);
                System.out.println("получен lock2, попытка получить lock1");
                sleep(50);

                // захват блокировки и возврат удачно/неудачно
                if (lock1.tryLock()) {
                    System.out.println("получен lock1");
                } else {
                    System.out.println("не удаётся получить lock1, снимаем lock2");
                    // оставить блокировку
                    lock2.unlock();
                    continue;
                }

                System.out.println("выполнение операции operation2");
                break;
            }
            lock1.unlock();
            lock2.unlock();
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }
}