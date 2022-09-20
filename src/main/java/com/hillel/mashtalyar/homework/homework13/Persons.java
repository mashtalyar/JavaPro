package com.hillel.mashtalyar.homework.homework13;

public class Persons {
    private final String name;
    private final int dayOfBirth;
    private final int monthOfBirth;
    private final int yearOfBirth;
    private final String email;
    private final String phone;
    String surname;
    int weight;
    int pressure;
    int stepsByDay;
    int age;
    Persons(String name, int dayOfBirth, int monthOfBirth, int yearOfBirth, String email, String phone, String surname, int weight, int pressure, int stepsByDay) {
        this.name = name;
        this.dayOfBirth = dayOfBirth;
        this.monthOfBirth = monthOfBirth;
        this.yearOfBirth = yearOfBirth;
        this.email = email;
        this.phone = phone;
        this.surname = surname;
        this.weight = weight;
        this.pressure = pressure;
        this.stepsByDay = stepsByDay;
        this.age = 2022 - yearOfBirth;
    }

    public String getName() {
        return this.name;
    }
    public int getDayOfBirth() {
        return this.dayOfBirth;
    }
    public int getMonthOfBirth() {
        return this.monthOfBirth;
    }
    public int getYearOfBirth() {
        return this.yearOfBirth;
    }
    public String getEmail() {
        return this.email;
    }
    public String getPhone() {
        return this.phone;
    }
    public String getSurname() {
        return this.surname;
    }
    public int getWeight() {
        return this.weight;
    }
    public int getPressure() {
        return this.pressure;
    }
    public int getStepsByDay() {
        return this.stepsByDay;
    }
    public int getAge() {
        return this.age;
    }

    public void setSurname(String surname) {
        this.surname = surname;
    }
    public void setWeight(int weight) {
        this.weight = weight;
    }
    public void setPressure(int pressure) {
        this.pressure = pressure;
    }
    public void setStepsByDay(int stepsByDay) {
        this.stepsByDay = stepsByDay;
    }

    public void printAccountInfo() {
        System.out.println(this);
    }
    @Override
    public String toString() {
        return "Info about person:\n" +
                "Name " + this.name + "\n" +
                "Day of birth " + this.dayOfBirth + "\n" +
                "Month of Birth " + this.monthOfBirth + "\n" +
                "Year of birth " + this.yearOfBirth + "\n" +
                "Email " + this.email + "\n" +
                "Phone " + this.phone + "\n" +
                "Surname " + this.surname + "\n" +
                "Weight " + this.weight + "\n" +
                "Pressure " + this.pressure + "\n" +
                "Steps of day " + this.stepsByDay + "\n" +
                "Age " + this.age + "\n";
    }
}




