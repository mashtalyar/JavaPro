package com.hillel.mashtalyar.homeworksecond.homework16;

public sealed class Human permits Woman,Man{
     String name;
     String lastName;
     int numbersOfArms;

    public String getName() {
        return name;
    }

    public String getLastName() {
        return lastName;
    }

    public int getNumbersOfArms() {
        return numbersOfArms;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public void setNumbersOfArms(int numbersOfArms) {
        this.numbersOfArms = numbersOfArms;
    }

}
