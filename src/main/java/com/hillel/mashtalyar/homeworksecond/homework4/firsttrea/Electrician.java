package com.hillel.mashtalyar.homeworksecond.homework4.firsttrea;

public final class Electrician extends Engineers  {
    public String name;
    public double salary;
    public void electricianWork(){
        System.out.println("Electrician was electrocuted");
    }
    @Override
    public void workersMustWork() {
        System.out.println("Electrician are working");
    }

    @Override
    public void workersMustChill() {

    }

    @Override
    public void workersMustLunch() {
        System.out.println("Electrician are eating");
    }

    @Override
    public void workersMustDrink() {

    }

}
