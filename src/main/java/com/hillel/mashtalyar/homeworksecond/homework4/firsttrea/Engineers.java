package com.hillel.mashtalyar.homeworksecond.homework4.firsttrea;

public abstract class Engineers extends Workers {
    String workSite;
    String skills;
    public void engineersGoToTheSites(){
        System.out.println("Engineers go to the sites");
    }
    @Override
    public void workersMustWork() {
        System.out.println("Engineers are working");
    }

    @Override
    public void workersMustLunch() {
        System.out.println("Engineers are eating");
    }
}
