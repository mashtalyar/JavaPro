package com.hillel.mashtalyar.homeworksecond.homework1;

import java.util.Arrays;

public class Homework {
    public static void main(String[] args) {
        byte firstNumber=125;
        short secondNumber=32764;
        char thirdNumber = 'a';
        long fourthNumber=9223372036L;
        float fifthNumber=3.33f;
        boolean booleanVariable=true;
        String firstStringVariable="Hello";
        String secondStringVariable  = new String(new char[] {'h', 'e', 'l', 'l', 'o'});

        int firstIntNumber=5; int secondIntNumber=6; int thirdIntNumber=7;
        double firstDoubleNumber=2.3; double secondDoubleNumber=3.4; double thirdDoubleNumber=5.6;

        System.out.println("Примеры с целыми и дробнимы числами");
        System.out.println(firstIntNumber*secondIntNumber-thirdIntNumber);
        System.out.println(firstIntNumber*secondIntNumber+thirdIntNumber);
        System.out.println(firstIntNumber*secondIntNumber/thirdIntNumber);
        System.out.println(firstIntNumber*secondIntNumber*thirdIntNumber);
        System.out.println(firstIntNumber/(secondIntNumber-thirdIntNumber));

        System.out.println(firstDoubleNumber+secondDoubleNumber+thirdDoubleNumber);
        System.out.println(firstDoubleNumber-secondDoubleNumber-thirdDoubleNumber);
        System.out.println(firstDoubleNumber+secondDoubleNumber*thirdDoubleNumber);
        System.out.println(firstDoubleNumber/secondDoubleNumber/thirdDoubleNumber);
        System.out.println(firstDoubleNumber*secondDoubleNumber*thirdDoubleNumber);

        int firstExamlpe=firstIntNumber+thirdIntNumber;
        int secondExamlpe=firstIntNumber-thirdIntNumber;
        int thirdExamlpe=firstIntNumber*thirdIntNumber;
        int fourthExamlpe=firstIntNumber+thirdIntNumber-thirdIntNumber;
        int  fifthExamlpe=firstIntNumber+thirdIntNumber*secondIntNumber;
        double sixthExamlpe=firstDoubleNumber+secondDoubleNumber;
        double seventhExamlpe=firstDoubleNumber-secondDoubleNumber;
        double eighthExamlpe=firstDoubleNumber*secondDoubleNumber;
        double ninthExamlpe=firstDoubleNumber/secondDoubleNumber;
        double tenthExamlpe=firstDoubleNumber+secondDoubleNumber-thirdDoubleNumber;
        System.out.println("Примеры с присвоением  с целыми и дробнимы числами");
        System.out.println(firstExamlpe);
        System.out.println(secondExamlpe);
        System.out.println(thirdExamlpe);
        System.out.println(fourthExamlpe);
        System.out.println(fifthExamlpe);
        System.out.println(sixthExamlpe);
        System.out.println(seventhExamlpe);
        System.out.println(eighthExamlpe);
        System.out.println(ninthExamlpe);
        System.out.println(tenthExamlpe);

        System.out.println("Примеры логичеких операций");
        System.out.println(!booleanVariable);
        System.out.println(!false);
        System.out.println(!(4 < 5));
        System.out.println(4 < 5 && 4>3);
        System.out.println(1 < 5 || 2>5);
        System.out.println(booleanVariable^(4<5));

        int numberForExampleWithIncrement=1;
        System.out.println("Использывание инкремента и декремента");
        System.out.println(numberForExampleWithIncrement);
        System.out.println(--numberForExampleWithIncrement);
        System.out.println(++numberForExampleWithIncrement);
        System.out.println(numberForExampleWithIncrement);
        System.out.println(numberForExampleWithIncrement);
        System.out.println(++numberForExampleWithIncrement);
        System.out.println(--numberForExampleWithIncrement);
        System.out.println(numberForExampleWithIncrement);

        System.out.println("Массив");
        double[] array=new double[]{1,2, 3.4,4.5,4,4444,888.888,333,0,45};
        System.out.println(Arrays.toString(array));
    }
}
