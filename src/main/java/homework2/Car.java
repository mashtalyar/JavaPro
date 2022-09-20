package com.hillel.mashtalyar.homeworksecond.homework2;

public class Car {
    final String model="BMW";
    final int numberOfWheels=4;
    final int numberOfDoors=4;

    public Car() {
    }
    public Car(String model,int numberOfDoors, int numberOfWheels){
    }
// конструктор со всеми параметрами пришлось создавать в ручную тк пр попытке сгренирировать его появилось сообщение о том что конструктор уже существует "Constructor already exist "

    public String getModel() {
        return model;
    }

    public int getNumberOfWheels() {
        return numberOfWheels;
    }

    public int getNumberOfDoors() {
        return numberOfDoors;
    }

//    public void setModel(){
//        this.model=model;
//}
//    public void setNumberOfWheels(){
//        this.numberOfWheels=numberOfWheels;
//    }
//    public void setNumberOfDoors(){
//        this.numberOfDoors=numberOfDoors;
//    }
//    нельзя создать сеттеры к final параметрам
}
