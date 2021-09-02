package ru.mirea.ikbo1319.task01;

import java.util.concurrent.locks.ReentrantLock;

public class Printer implements Runnable {
    private final ReentrantLock lock;
    private final String message;

    public Printer(String message, ReentrantLock lock) {
        this.message = message;
        this.lock = lock;
    }

    @Override
    public void run() {
        lock.lock();
        try {
            System.out.println(message);
        } finally {
            lock.unlock();
        }
    }
}
