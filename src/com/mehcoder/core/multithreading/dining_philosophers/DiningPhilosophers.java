package com.mehcoder.core.multithreading.dining_philosophers;

public class DiningPhilosophers {
    public static void main(String[] args) {

        Philosopher[] philosophers = new Philosopher[3];
        Object[] forks = new Object[philosophers.length];

        for (int i = 0; i < forks.length; i++) {
            forks[i] = new Object();
        }

        for (int i = 0; i < philosophers.length; i++) {
            Object leftFork = forks[i];
            Object rightFork = forks[(i + 1) % forks.length];

            philosophers[i] = new Philosopher(leftFork, rightFork);

//            решение дедлока обедающих философов
//            if (i == philosophers.length - 1) {
//                // Последний философ первым берет в руки правую вилку
//                philosophers[i] = new Philosopher(rightFork, leftFork);
//            } else {
//                philosophers[i] = new Philosopher(leftFork, rightFork);
//            }

            Thread t = new Thread(philosophers[i], "Филосов " + (i + 1));
            t.start();
        }
    }
}
