package com.mehcoder.patterns.creational.abstract_factory;

import com.mehcoder.patterns.creational.abstract_factory.factory.AbstractFactory;

public class Main {
    public static void main(String[] args) {
        AbstractFactory factory1 = FactoryProducer.getFactory("TINKOFF");
        factory1.getAccount().accountType();
        factory1.getBank().bankName();

        System.out.println();

        AbstractFactory factory2 = FactoryProducer.getFactory("SBER");
        factory2.getAccount().accountType();
        factory2.getBank().bankName();
    }
}
