package com.hillel.mashtalyar.homeworksecond.homework18;

public class SecondClass {
    private FirstClass first;

    public FirstClass getFirst() {
        return first;
    }

    public void setFirst(final FirstClass first) {
        this.first = first;
    }

    public synchronized String getString() {
        return "Second class is working";
    }

    public synchronized String getStringFromFirstClass() {
        return first.getString();
    }

}
