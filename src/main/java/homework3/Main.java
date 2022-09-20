package com.hillel.mashtalyar.homeworksecond.homework3;

import java.util.Scanner;

public class Main {


    public static void main(String[] args) {
        User user = new User("Andriy","Vinnick","andrey@gmail.com","12345","male","Ukraine");
        Support support=new Support("David","Ivanko","david@gmail.com","12345","male","Ukraine");
        Admin admin=new Admin("Sasha","Dmitrov","sasha@gmail.com","12345","male","Ukraine");

//   usersCommands(user);
//   usersCommands(support);
   usersCommands(admin);

    }
    public static void usersCommands(User person){
        Scanner scanner=new Scanner(System.in);
        User user = new User("Andriy","Vinnick","andrey@gmail.com","12345","male","Ukraine");
        Support support=new Support("David","Ivanko","david@gmail.com","12345","male","Ukraine");
        Admin admin=new Admin("Sasha","Dmitrov","sasha@gmail.com","12345","male","Ukraine");
        String text=scanner.next();
        if(person instanceof User ){
        user.writing();
        }

         if(person instanceof Support){;
            support.checkLine(text);
        }
       if(person instanceof Admin ){
            admin.deleteLine(text);
        }
    }


}
