package com.hillel.mashtalyar.homeworksecond.homework19;

import com.hillel.mashtalyar.homeworksecond.homework19.deadlockClasses.First;
import com.hillel.mashtalyar.homeworksecond.homework19.deadlockClasses.Second;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.atomic.AtomicInteger;

public class Main {
    public static Object Lock1 = new Object();
    public static Object Lock2 = new Object();
    static volatile AtomicInteger integer = new AtomicInteger(100000);

    public static void main(String[] args) {
        executeMethod();
        lockMethods();
        deadlockMethod();
    }

    public static synchronized void executeMethod() {
        final ExecutorService executorService = Executors.newCachedThreadPool();
        executorService.execute(() -> {
            for (int j = 0; j < 10000; j++) {
                Thread thread = new Thread(() ->
                        integer.decrementAndGet());
                thread.start();
            }
        });
        executorService.execute(() -> {
            for (int j = 0; j < 10000; j++) {
                Thread thread = new Thread(() ->
                        integer.decrementAndGet());
                thread.start();
            }
            try {
                Thread.sleep(2000);
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }
            System.out.println("integer: " + integer.get());
        });

    }

    public static synchronized void deadlockMethod() {
        First first = new First();
        Second second = new Second();
        first.start();
        second.start();
    }

    private static synchronized void lockMethods() {
        LockClass lockClass = new LockClass();
        final Thread thread = new Thread(new Runnable() {
            @Override
            public void run() {
                lockClass.one();
                lockClass.two();
                lockClass.three();
            }
        });
        final Thread thread2 = new Thread(new Runnable() {
            @Override
            public void run() {

                lockClass.one();
                lockClass.two();
                lockClass.three();
            }
        });
        final Thread thread3 = new Thread(new Runnable() {
            @Override
            public void run() {

                lockClass.one();
                lockClass.two();
                lockClass.three();
            }
        });
        thread.start();
        thread2.start();
        thread3.start();
    }

}
