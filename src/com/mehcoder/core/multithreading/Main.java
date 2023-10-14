package com.mehcoder.core.multithreading;

import java.util.concurrent.atomic.AtomicInteger;

public class Main {
    public static void main(String[] args) {
        AtomicInteger counter = new AtomicInteger(5);
// получить значение 5
        counter.get();
// увеличить значение на 1
        int result = counter.incrementAndGet();
        System.out.println(result);
    }
}
