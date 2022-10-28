package com.hillel.mashtalyar.homeworksecond.homework13;

public class FirstClass implements First,Second{

    @Override
    public void defaultMethod() {
    System.out.println("DEFAULT from FirstClass");
    }

    @Override
    public void methodFirst(String name) {
        System.out.println("My name is "+name);
    }

    @Override
    public void methodSecond(String lastname) {
        System.out.println("My lastname is "+lastname);
    }
}
