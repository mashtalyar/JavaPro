package com.hillel.mashtalyar.homeworksecond.homework19.deadlockClasses;

import static com.hillel.mashtalyar.homeworksecond.homework19.Main.Lock1;
import static com.hillel.mashtalyar.homeworksecond.homework19.Main.Lock2;

public class First extends Thread{

    public void run() {

        synchronized (Lock1) {
            System.out.println("Thread 1: Hold lock 1");

            try {
                Thread.sleep(10);
            }
            catch (InterruptedException e) {}
            System.out.println("Thread 1: Wait for lock 2");

            synchronized (Lock2) {
                System.out.println("Thread 1: Holding lock 1 and 2");
            }
        }
    }



}

