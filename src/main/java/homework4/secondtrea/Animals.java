package com.hillel.mashtalyar.homeworksecond.homework4.secondtrea;

import com.hillel.mashtalyar.homeworksecond.homework4.interfaces.FirstInterfaceForAnimals;
import com.hillel.mashtalyar.homeworksecond.homework4.interfaces.SecondInterfaceForAnimals;
import com.hillel.mashtalyar.homeworksecond.homework4.interfaces.SeparateInterface;

public abstract class Animals implements FirstInterfaceForAnimals, SecondInterfaceForAnimals, SeparateInterface {
    public double weight;
    public String color;
    public void animalsActivity(){
        System.out.println("Animal ia alive");
    }

    @Override
    public void animalMustEat() {
        System.out.println("Animal must eat");

    }

    @Override
    public void animalsMustDrink() {
        System.out.println("Animal must drink");

    }

    @Override
    public void creaturesMustBreathe() {
        System.out.println("Animal must breathe");

    }
}
