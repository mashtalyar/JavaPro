package com.hillel.mashtalyar.homeworksecond.homework2;

public class Variables {
    byte firstNumber=125;
    short secondNumber=32764;
    char thirdNumber = 'a';
    long fourthNumber=9223372036L;
    float fifthNumber=3.33f;
    int sixthNumber=5;
    double seventhNumber=2.3;
    boolean booleanVariable=true;
    String firstStringVariable="Hello";
    //Setters
    public void setFirstNumber(byte firstNumber) {
        this.firstNumber = firstNumber;
    }

    public void setSecondNumber(short secondNumber) {
        this.secondNumber = secondNumber;
    }

    public void setThirdNumber(char thirdNumber) {
        this.thirdNumber = thirdNumber;
    }

    public void setFourthNumber(long fourthNumber) {
        this.fourthNumber = fourthNumber;
    }

    public void setFifthNumber(float fifthNumber) {
        this.fifthNumber = fifthNumber;
    }

    public void setSixthNumber(int sixthNumber) {
        this.sixthNumber = sixthNumber;
    }

    public void setSeventhNumber(double seventhNumber) {
        this.seventhNumber = seventhNumber;
    }

    public void setBooleanVariable(boolean booleanVariable) {
        this.booleanVariable = booleanVariable;
    }

    public void setFirstStringVariable(String firstStringVariable) {
        this.firstStringVariable = firstStringVariable;
    }
//Getters
    public byte getFirstNumber() {
        return firstNumber;
    }

    public short getSecondNumber() {
        return secondNumber;
    }

    public char getThirdNumber() {
        return thirdNumber;
    }

    public long getFourthNumber() {
        return fourthNumber;
    }

    public float getFifthNumber() {
        return fifthNumber;
    }

    public int getSixthNumber() {
        return sixthNumber;
    }

    public double getSeventhNumber() {
        return seventhNumber;
    }

    public boolean getBooleanVariable() {
        return booleanVariable;
    }

    public String getFirstStringVariable() {
        return firstStringVariable;
    }

    //Constructors
    public Variables() {

    }

    public Variables(byte firstNumber) {
        this.firstNumber = firstNumber;
    }

    public Variables(byte firstNumber, short secondNumber) {
        this.firstNumber = firstNumber;
        this.secondNumber = secondNumber;
    }

    public Variables(byte firstNumber, short secondNumber, char thirdNumber) {
        this.firstNumber = firstNumber;
        this.secondNumber = secondNumber;
        this.thirdNumber = thirdNumber;
    }

    public Variables(byte firstNumber, short secondNumber, char thirdNumber, long fourthNumber) {
        this.firstNumber = firstNumber;
        this.secondNumber = secondNumber;
        this.thirdNumber = thirdNumber;
        this.fourthNumber = fourthNumber;
    }

    public Variables(byte firstNumber, short secondNumber, char thirdNumber, long fourthNumber, float fifthNumber) {
        this.firstNumber = firstNumber;
        this.secondNumber = secondNumber;
        this.thirdNumber = thirdNumber;
        this.fourthNumber = fourthNumber;
        this.fifthNumber = fifthNumber;
    }

    public Variables(byte firstNumber, short secondNumber, char thirdNumber, long fourthNumber, float fifthNumber, int sixthNumber) {
        this.firstNumber = firstNumber;
        this.secondNumber = secondNumber;
        this.thirdNumber = thirdNumber;
        this.fourthNumber = fourthNumber;
        this.fifthNumber = fifthNumber;
        this.sixthNumber = sixthNumber;
    }

    public Variables(byte firstNumber, short secondNumber, char thirdNumber, long fourthNumber, float fifthNumber, int sixthNumber, double seventhNumber) {
        this.firstNumber = firstNumber;
        this.secondNumber = secondNumber;
        this.thirdNumber = thirdNumber;
        this.fourthNumber = fourthNumber;
        this.fifthNumber = fifthNumber;
        this.sixthNumber = sixthNumber;
        this.seventhNumber = seventhNumber;
    }

    public Variables(byte firstNumber, short secondNumber, char thirdNumber, long fourthNumber, float fifthNumber, int sixthNumber, double seventhNumber, boolean booleanVariable) {
        this.firstNumber = firstNumber;
        this.secondNumber = secondNumber;
        this.thirdNumber = thirdNumber;
        this.fourthNumber = fourthNumber;
        this.fifthNumber = fifthNumber;
        this.sixthNumber = sixthNumber;
        this.seventhNumber = seventhNumber;
        this.booleanVariable = booleanVariable;
    }

    public Variables(byte firstNumber, short secondNumber, char thirdNumber, long fourthNumber, float fifthNumber, int sixthNumber, double seventhNumber, boolean booleanVariable, String firstStringVariable) {
        this.firstNumber = firstNumber;
        this.secondNumber = secondNumber;
        this.thirdNumber = thirdNumber;
        this.fourthNumber = fourthNumber;
        this.fifthNumber = fifthNumber;
        this.sixthNumber = sixthNumber;
        this.seventhNumber = seventhNumber;
        this.booleanVariable = booleanVariable;
        this.firstStringVariable = firstStringVariable;
    }
}

