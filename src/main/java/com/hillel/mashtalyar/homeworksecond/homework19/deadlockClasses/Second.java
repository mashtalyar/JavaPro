package com.hillel.mashtalyar.homeworksecond.homework19.deadlockClasses;

import static com.hillel.mashtalyar.homeworksecond.homework19.Main.Lock1;
import static com.hillel.mashtalyar.homeworksecond.homework19.Main.Lock2;

public class Second extends Thread {

    public void run() {

        synchronized (Lock2) {
            System.out.println("Thread 2: Hold lock 2");

            try {
                Thread.sleep(10);
            }
            catch (InterruptedException e) {}
            System.out.println("Thread 2: Wait for lock 1");

            synchronized (Lock1) {
                System.out.println("Thread 2: Hold lock 1 and 2");
            }
        }
    }


}

