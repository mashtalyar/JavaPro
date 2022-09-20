package com.hillel.mashtalyar.homework.homework13;

public class Main {
    public static void main(String[] args) {
       Persons person1=new Persons("Serhiy", 20, 10, 2003, "mashtalyar953@dnsvitoch.org", "0989151795", "Mashtalyar", 83, 93, 10000);
       person1.printAccountInfo();
       Persons person2=new Persons("Andrey", 15, 11, 2004, "kisliypro@email.com", "0989767566", "Kisliy", 80, 110, 14141);
       person2.printAccountInfo();
       Persons person3 = new Persons("IlLya", 2, 5, 2001, "illiyazhiraf@email.com", "096678771", "Maslov", 77, 94, 10107);
        person3.printAccountInfo();
        Persons person4= new Persons("Oleg",20,3,1989,"olezhamaster@gmaol.com","098113431","Mokish",88,90,14098);
        person4.printAccountInfo();
        person3.setSurname("Maslo");
        person3.setWeight(75);
        person3.setPressure(120);
        person3.setStepsByDay(11231);
        person3.printAccountInfo();
        person4.setSurname("Kizaru");
        person4.setWeight(75);
        person4.setStepsByDay(15690);
        person4.printAccountInfo();

    }
}



