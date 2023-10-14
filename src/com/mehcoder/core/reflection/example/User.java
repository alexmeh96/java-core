package com.mehcoder.core.reflection.example;

import java.io.Serializable;

public class User extends Person implements Serializable, Comparable<User> {

    private String name;

    @MinAge("10")
    private int age;

    public User(Long id, String name) {
        super(id);
        this.name = name;
    }

    @Override
    public int compareTo(User user) {
        return 0;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    @Override
    public String toString() {
        return "User{" +
               "name='" + name + '\'' +
               ", age=" + age +
               "} " + super.toString();
    }
}
