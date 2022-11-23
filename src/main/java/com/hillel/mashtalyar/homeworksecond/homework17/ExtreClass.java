package com.hillel.mashtalyar.homeworksecond.homework17;

public class ExtreClass {
     static int number=1;

    public static synchronized void extraMethod(){
        System.out.println("Thread name is: "+Thread.currentThread().getName() +" ,number is: "+number);
        number++;
    }
}
