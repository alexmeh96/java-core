package com.mehcoder.patterns.structural.decorator;

public class Main {
    public static void main(String[] args) {
        DataSource dataSource1 = new FileDataSource();
        dataSource1.writeData("this is my data1");
        dataSource1.readData();

        System.out.println();

        DataSource dataSource2 = new EncryptionDecorator(new FileDataSource());
        dataSource2.writeData("this is my data2");
        dataSource2.readData();
    }
}
