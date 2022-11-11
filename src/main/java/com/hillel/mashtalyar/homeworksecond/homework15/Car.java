package com.hillel.mashtalyar.homeworksecond.homework15;

public class Car {
    private static String mark="Mersedes";
    private String numberOfWheals="4";

    public Car(String mark, String numberOfWheals) {
        this.mark = mark;
        this.numberOfWheals = numberOfWheals;
    }


    public Car(String mark) {
        this.mark = mark;
    }



    public void setMark(String mark) {
        this.mark = mark;
    }

    public void setNumberOfWheals(String numberOfWheals) {
        this.numberOfWheals = numberOfWheals;
    }

    public String getNumberOfWheals() {
        return numberOfWheals;
    }

    public  static String getMark() {
        return mark;
    }
}
