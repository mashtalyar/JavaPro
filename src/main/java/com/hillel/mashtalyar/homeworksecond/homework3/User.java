package com.hillel.mashtalyar.homeworksecond.homework3;

import java.util.Scanner;

public class User {
    Scanner scanner= new Scanner(System.in);
    String name;
    String surname;
    String email;
    String password;
    String gender;
    String country;


    public User(String name, String surname, String email, String password, String gender, String country) {
        this.name = name;
        this.surname = surname;
        this.email = email;
        this.password = password;
        this.gender = gender;
        this.country = country;
    }
    static final String line="Гром стреляет, как из пушки.\n" +
            "Хлещет дождь по спинам луж.\n" +
            "Под дождём сидят лягушки –\n" +
            "Принимают тёплый душ.";


public void reading(String text){
    System.out.println(text);
}
public void writing(){
    String inputData= scanner.next();
    System.out.println(inputData);
}
}
