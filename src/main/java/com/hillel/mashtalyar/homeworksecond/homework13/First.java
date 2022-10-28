package com.hillel.mashtalyar.homeworksecond.homework13;

public interface First {
    public default void defaultMethod(){
        System.out.println("DEFAULT");
    }
    public static void staticMethodFirst(){
    System.out.println("Static from first");
    }
    void methodFirst(String name);
    void methodSecond(String lastname);

}

