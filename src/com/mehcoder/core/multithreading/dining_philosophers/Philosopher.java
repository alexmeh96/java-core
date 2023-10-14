package com.mehcoder.core.multithreading.dining_philosophers;

public class Philosopher implements Runnable {

    // The forks on either side of this Philosopher
    private final Object leftFork;
    private final Object rightFork;

    public Philosopher(Object leftFork, Object rightFork) {
        this.leftFork = leftFork;
        this.rightFork = rightFork;
    }

    @Override
    public void run() {
        try {
            while (true) {
                // thinking
                doAction(System.nanoTime() + ": Размышляет");
                synchronized (leftFork) {
                    doAction(String.format("%s: Поднял левую вилку", System.nanoTime()));
                    synchronized (rightFork) {
                        // eating
                        doAction(String.format("%s: Взял правую вилку - обедает", System.nanoTime()));
                        doAction(String.format("%s: Положил правую вилку", System.nanoTime()));
                    }
                    // Back to thinking
                    doAction(String.format("%s: Положил левую вилку. Вернулся к размышлению", System.nanoTime()));
                }
            }
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }

    private void doAction(String action) throws InterruptedException {
        System.out.println(Thread.currentThread().getName() + " " + action);
        Thread.sleep(((int) (Math.random() * 100)));
    }

}
