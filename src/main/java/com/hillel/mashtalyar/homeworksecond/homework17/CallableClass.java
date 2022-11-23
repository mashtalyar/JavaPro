package com.hillel.mashtalyar.homeworksecond.homework17;

import java.util.concurrent.Callable;

import static com.hillel.mashtalyar.homeworksecond.homework17.ExtreClass.extraMethod;

public class CallableClass implements Callable {
    @Override
    public Object call() throws Exception {
        for (int i = 0; i < 1000; i++) {
            System.out.print("CallableClass- ");  extraMethod();
        }
        return "method ended the work";
    }
}