package com.hillel.mashtalyar.homeworksecond.homework5;

import java.sql.SQLOutput;

import static com.hillel.mashtalyar.homeworksecond.homework5.StringCheck.*;
import static com.hillel.mashtalyar.homeworksecond.homework5.StringHelper.stringCheck;

public class Main {
    public static void main(String[] args) {
      String firstString=("A'm a student");
      char[] array={'i', 'n', ' ', 'u','n','i','v','e','s','i','t','y'};
        System.out.println("Return String:"+stringCheck(firstString,array));
String number="+380989151795";
String email="serg49049@gmail.com";
String dateOfBirthday="20.10.2003";
        System.out.println("Phone number is "+ checkPhone(number));
        System.out.println("Phone email is "+ checkEmail(email));
        System.out.println("Date is "+checkDate(dateOfBirthday));
    }
}


