package com.hillel.mashtalyar.homeworksecond.homework3;

public class Support extends User {

    public Support(String name, String surname, String email, String password, String gender, String country) {
        super(name, surname, email, password, gender, country);
    }


    public boolean checkLine(String text){
            if (text == line) {
                System.out.println("содержит");
                return true;
            } else {
                System.out.println("не содержит");
                return false;
            }
    }

}
