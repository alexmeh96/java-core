package com.mehcoder.core.multithreading.wait_notify;

// пример отправки пакета, если его нет и получение пакета если он есть,
// потоком отправки и потоком получения
public class Main {
    public static void main(String[] args) {
        Data data = new Data();
        Thread sender = new Thread(new Sender(data));
        Thread receiver = new Thread(new Receiver(data));

        sender.start();
        receiver.start();
    }
}
