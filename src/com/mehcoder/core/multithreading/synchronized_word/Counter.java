package com.mehcoder.core.multithreading.synchronized_word;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Counter {

    private int count;

    private Object object = new Object();

    public synchronized static void init1() {
        System.out.println("init1");
        List<String> list = Collections.synchronizedList(new ArrayList<>());
        List<String> coll = new ArrayList<>();
        List<String> list1 = List.copyOf(coll);
    }

    public static void init2() {
        synchronized (Counter.class) {
            System.out.println("init2");
        }
    }

    public synchronized void increment() {
        count++;
    }

    public void decrement() {
        synchronized (object) {
            count--;
        }
    }

    public int getCount() {
        return count;
    }
}