package com.hillel.mashtalyar.homeworksecond.homework13;

public interface Third {
    public default void defaultMethod(){
        System.out.println("DEFAULT");
    }
    public static void staticMethodThird(){
        System.out.println("Static from third");
    }
    void methodFirst(String name);
    void methodSecond(String lastname);

}
