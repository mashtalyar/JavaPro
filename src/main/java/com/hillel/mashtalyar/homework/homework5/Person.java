package com.hillel.mashtalyar.homework.homework5;

public class Person {
    public static void main(String[] args) {
        String firstname = "Will";
        String secondname = "Jackie";
        String thirdname = "Sherlock";
        String firstlastname = "Smith";
        String secondlastname = "Chan";
        String thirdlastname = "Holms";
        String city1="New York";
        String city2="Shanghai";
        String city3="London";
        long phone1= 2936729462846l;
        long phone2= 12312412412l;
        long phone3= 37742123513l;
        System.out.println(personinfo(firstname,firstlastname,city1,phone1));
        System.out.println(personinfo(secondname,secondlastname,city2,phone2));
        System.out.println(personinfo(thirdname,thirdlastname,city2,phone3));

    }

static String personinfo(String name,String lastname,String city,long phone){
        String result="Позвонить гражданину "+name +" "+lastname+ " из города " +city +" можно по номеру "+phone;
        return result;
}




}
