package com.hillel.mashtalyar.homeworksecond.homework18;

public class Main {
    public static void main(String[] args) throws InterruptedException {
        ExtraService extraService = new ExtraService();
        for (int i = 0; i < 3; i++) {
            Thread thread = new Thread(extraService::synchronizedMethod);
            thread.start();
            thread.join();
        }
        //-----------------------------
        Thread threadSecond = new Thread(extraService::synchronizedPartOfMethod);
        threadSecond.start();
        threadSecond.join();
        //-----------------------------
        final Object object=new Object();
        for (int i = 0; i < 3; i++) {
            Thread threadThird = new Thread(() -> extraService .synchronizedForObject(object));
            threadThird.start();
            threadThird.join();
        }
        //-----------------------------
//        final FirstClass first = new FirstClass();
//        final SecondClass second = new SecondClass();
//        first.setSecond(second);
//        second.setFirst(first);
//
//        final Thread deadlockFirstThread = new Thread(() -> System.out.println(first.getStringFromSecondClass()));
//        final Thread deadlockSecondThread = new Thread(() -> System.out.println(second.getStringFromFirstClass()));
//        deadlockFirstThread.start();
//        deadlockSecondThread.start();
        //------------------------------
        Object secondObject = new Object();
        Thread threadWaitNotify = new Thread(() -> {
            synchronized (secondObject) {
                for (int i = 0; i < 5; i++) {
                    System.out.println("Thread name: " + Thread.currentThread().getName());
                    try {
                        Thread.sleep(1000);
                    } catch (InterruptedException error) {
                        error.printStackTrace();
                    }
                }
                secondObject.notify();
            }
        });

        threadWaitNotify.start();
        synchronized (secondObject) {
            secondObject.wait();
        }
        System.out.println("Finished");

    }
}

