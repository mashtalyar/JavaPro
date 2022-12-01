package com.hillel.mashtalyar.homeworksecond.homework19;

import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReentrantLock;

public class LockClass{
   Lock lock=new ReentrantLock();
    public void one(){
        lock.lock();
        for (int i = 0; i < 6; i++) {
            System.out.println("one");
        }
    }public void two(){
        for (int i = 0; i < 6; i++) {
            System.out.println("two");
        }
    }
    public void three(){

        for (int i = 0; i < 6; i++) {
            System.out.println("three");
        }
        lock.unlock();
    }


}
