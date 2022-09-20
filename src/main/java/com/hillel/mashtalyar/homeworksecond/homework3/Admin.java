package com.hillel.mashtalyar.homeworksecond.homework3;

public class Admin extends User {

    public Admin(String name, String surname, String email, String password, String gender, String country) {
        super(name, surname, email, password, gender, country);
    }


    public String deleteLine(String line){
        Support support= new Support("David","Ivanko","david@gmail.com","12345","male","Ukraine");

        if(support.checkLine(line)==true){
            line=null;
        }
        System.out.println(line);
        return line;
    }



}
