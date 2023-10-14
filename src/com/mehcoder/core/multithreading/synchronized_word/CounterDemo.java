package com.mehcoder.core.multithreading.synchronized_word;

public class CounterDemo {

    public static void main(String[] args) {
        Counter counter = new Counter();
        CounterThreadIncrement counterThreadIncrement3 = new CounterThreadIncrement(counter);
        CounterThreadIncrement counterThreadIncrement4 = new CounterThreadIncrement(counter);
        CounterThreadIncrement counterThreadIncrement5 = new CounterThreadIncrement(counter);

        CounterThreadDecrement counterThreadDecrement3 = new CounterThreadDecrement(counter);
        CounterThreadDecrement counterThreadDecrement4 = new CounterThreadDecrement(counter);
        CounterThreadDecrement counterThreadDecrement5 = new CounterThreadDecrement(counter);

        counterThreadIncrement3.start();
        counterThreadIncrement4.start();
        counterThreadIncrement5.start();

        counterThreadDecrement3.start();
        counterThreadDecrement4.start();
        counterThreadDecrement5.start();

        try {
            counterThreadIncrement3.join();
            counterThreadIncrement4.join();
            counterThreadIncrement5.join();

            counterThreadDecrement3.join();
            counterThreadDecrement4.join();
            counterThreadDecrement5.join();
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

        System.out.println(counter.getCount());
    }
}