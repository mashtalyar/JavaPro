package com.hillel.mashtalyar.homework.homework7;

import java.util.Scanner;

public class Numbers {
    public static void main(String[] args) {
        int n = (int) (Math.random() * 11);
        System.out.println(n);
        Scanner scanner = new Scanner(System.in);
        int attempt=5;
        while(attempt>0) {
            System.out.println("У вас осталось попыток:" +attempt);
            attempt--;
            int number = inputData(scanner);
            if (number==n){
                System.out.println("Congratulations, you win!!!");
break;
            }
            else if (Math.abs(number-n)==1){
                    System.out.println("You are very very close");
                    System.out.println("Don't give up, try again");}
            else {
                if(Math.abs(number-n)<3){
                System.out.println("You are close");
            }
                System.out.println("Don't give up, try again");
            };
        }

    }
    static int inputData (Scanner scanner){
        System.out.println("Enter number: ");
        while (true) {
            if (scanner.hasNextInt()) {
                return scanner.nextInt();
            } else {
                System.out.println("Wrong data. Try again");
                scanner.nextLine();
            }
        }
    }
}
