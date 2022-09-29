package com.hillel.mashtalyar.homeworksecond.homework4.firsttrea;

public final class Mechanic extends Engineers{
    public String name;
    public double salary;
    public void mechanicWork(){
        System.out.println("Mechanic changing the wheel of a car");
    }
    @Override
    public void workersMustWork() {
        System.out.println("Mechanic are working");
    }

    @Override
    public void workersMustChill() {

    }

    @Override
    public void workersMustLunch() {
        System.out.println("Mechanic are eating");
    }

    @Override
    public void workersMustDrink() {

    }

}
