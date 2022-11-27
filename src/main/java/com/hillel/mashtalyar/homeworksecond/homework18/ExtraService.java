package com.hillel.mashtalyar.homeworksecond.homework18;

public class ExtraService {
    public synchronized void synchronizedMethod(){
        int numberOfThread=0;
        for (int i = 0; i < 5; i++) {
//            Thread.currentThread().setName(String.valueOf(numberOfThread));
            System.out.println("Thread name is:"+Thread.currentThread().getName());
//            numberOfThread++;
        }
    }
    public void synchronizedPartOfMethod() {
        for (int i = 0; i < 10; i++) {
            System.out.println("NonSynchronized thread name: " + Thread.currentThread().getName());
        }
        synchronized (this) {
            for (int i = 0; i < 10; i++) {
                System.out.println("Synchronized thread name: " + Thread.currentThread().getName());
            }
        }
    }
    public void synchronizedForObject(final Object object) {
        synchronized (object) {
            for (int i = 0; i < 10; i++) {
                System.out.println("Synchronized name for Object: " + Thread.currentThread().getName());
            }
        }
    }


}
