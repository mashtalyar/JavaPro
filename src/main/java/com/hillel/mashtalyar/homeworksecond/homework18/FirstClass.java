package com.hillel.mashtalyar.homeworksecond.homework18;

public class FirstClass {
    private SecondClass second;

    public SecondClass getSecond() {
        return second;
    }

    public void setSecond(final SecondClass second) {
        this.second = second;
    }

    public synchronized String getString() {
        return "First class is working";
    }

    public synchronized String getStringFromSecondClass() {
        try {
            Thread.sleep(10);
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
        return second.getString();
    }

}
