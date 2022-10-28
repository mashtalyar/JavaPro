package com.hillel.mashtalyar.homeworksecond.homework13;

public interface Second {
    public default void defaultMethod(){
        System.out.println("DEFAULT");
    }
    public static void staticMethodSecond(){
        System.out.println("Static from second");
    }
    void methodFirst(String name);
    void methodSecond(String lastname);


}
