package com.hillel.mashtalyar.homeworksecond.homework4.secondtrea;

public abstract class Mammals extends Animals{
    public int numberOfLegs;
    public int numberOfTails;
    public void mammalsActivity(){
        System.out.println("Mammals need eat");
    }
    @Override
    public void animalMustEat() {
        System.out.println("Mammals must eat");

    }

    @Override
    public void animalsMustDrink() {
        System.out.println("Mammals must drink");

    }

    @Override
    public void creaturesMustBreathe() {
        System.out.println("Mammals must breathe");

    }
}
