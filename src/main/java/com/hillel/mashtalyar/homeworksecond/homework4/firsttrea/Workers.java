package com.hillel.mashtalyar.homeworksecond.homework4.firsttrea;

import com.hillel.mashtalyar.homeworksecond.homework4.interfaces.FirstInterfaceForWorkers;
import com.hillel.mashtalyar.homeworksecond.homework4.interfaces.SecondInterfaceForWorkers;

public abstract class Workers implements FirstInterfaceForWorkers, SecondInterfaceForWorkers {
public String workExperience;
public String name;
public void workersGoToTheJob() {
    System.out.println("Workers start work");
}
@Override
public void workersMustWork() {
    System.out.println("Workers are working");
}

    @Override
    public void workersMustLunch() {
        System.out.println("Workers are eating");
    }
}
