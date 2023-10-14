package com.mehcoder.patterns.creational.abstract_factory;

import com.mehcoder.patterns.creational.abstract_factory.factory.AbstractFactory;
import com.mehcoder.patterns.creational.abstract_factory.factory.SberFactory;
import com.mehcoder.patterns.creational.abstract_factory.factory.TincoffFactory;

public class FactoryProducer {
    private final static String TINKOFF = "TINKOFF";
    private final static String SBER = "SBER";

    // фабричный метод, который создаёт нужный нам объект
    public static AbstractFactory getFactory(String nameCompany) {
        if (TINKOFF.equals(nameCompany)) {
            return new TincoffFactory();
        } else if (SBER.equals(nameCompany)) {
            return new SberFactory();
        }
        throw new RuntimeException();
    }
}
