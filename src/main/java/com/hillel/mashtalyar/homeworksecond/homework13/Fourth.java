package com.hillel.mashtalyar.homeworksecond.homework13;

public interface Fourth {
    public default void defaultMethod(){
        System.out.println("DEFAULT from ");
    }
    public static void staticMethodFourth(){
        System.out.println("Static from fourth");
    }
    void methodFirst(String name);
    void methodSecond(String lastname);
}
