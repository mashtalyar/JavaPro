package com.hillel.mashtalyar.homework.homework12;

public class Classes {
    String bread;
    String meat;
    int doubleMeet;
    String cheese;
    String souse;
    String salad;


    public Classes(String bread,String meat,String cheese,String souse,String salad){
        this.bread=bread;
        this.meat=meat;
        this.cheese=cheese;
        this.souse=souse;
        this.salad=salad;
        System.out.println("Default burger: "+bread+", "+meat+", "+cheese+", "+souse+", "+salad);
    }


    public  Classes(String bread, String meat, String cheese, String salad) {
        this.bread = bread;
        this.meat = meat;
        this.cheese = cheese;
        this.salad = salad;
        System.out.println("Diet burger: "+bread+", "+meat+", "+cheese+", "+salad);
    }

    public Classes(String bread, String meat,int doubleMeet, String cheese, String souse, String salad) {
        this.bread = bread;
        this.meat = meat;
        this.cheese = cheese;
        this.souse = souse;
        this.salad = salad;
        this.doubleMeet=2;
        System.out.println("Double burger: "+bread+", "+doubleMeet+meat+", "+cheese+", "+souse+", "+salad);
    }
}
