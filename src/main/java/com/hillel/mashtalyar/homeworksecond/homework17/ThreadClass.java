package com.hillel.mashtalyar.homeworksecond.homework17;

import static com.hillel.mashtalyar.homeworksecond.homework17.ExtreClass.extraMethod;

public class ThreadClass extends Thread{
    @Override
    public void run() {
        for (int i = 0; i < 1000; i++) {
            System.out.print("ThreadClass- "); extraMethod();
        }
    }
}
