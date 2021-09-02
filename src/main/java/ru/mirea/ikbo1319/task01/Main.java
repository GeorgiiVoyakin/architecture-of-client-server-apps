package ru.mirea.ikbo1319.task01;

import java.util.concurrent.locks.ReentrantLock;

public class Main {
    public static void main(String[] args) {
        ReentrantLock reentrantLock = new ReentrantLock();

        for (int i = 0; i < 5; i++) {
            String message;
            if (i % 2 == 0) {
                message = "Ping";
            } else {
                message = "Pong";
            }
            Thread t = new Thread(new Printer(message, reentrantLock));
            t.setName("Thread" + i);
            t.start();
        }
    }
}
