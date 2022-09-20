package com.hillel.mashtalyar.homeworksecond.homework4.firsttrea;

public final class Locksmith extends Engineers{
    public String name;
    public double salary;
    public void locksmithWork(){
        System.out.println("Locksmith changing light bulb");
    }
    @Override
    public void workersMustWork() {
        System.out.println("Locksmith are working");
    }

    @Override
    public void workersMustChill() {

    }

    @Override
    public void workersMustLunch() {
        System.out.println("Locksmith are eating");
    }

    @Override
    public void workersMustDrink() {

    }
}
