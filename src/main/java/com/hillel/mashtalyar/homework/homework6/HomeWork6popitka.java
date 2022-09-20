package com.hillel.mashtalyar.homework.homework6;

import java.util.Scanner;

public class HomeWork6popitka {
    public static void main(String[] args) {

        Scanner scanner=new Scanner(System.in);
        System.out.println("input first team name:");
        String team1=scanner.next();
        System.out.println("first team:"+team1);
        System.out.println("input second team name:");
        String team2=scanner.next();
        System.out.println("second team:"+team2);
        players(team1);

    }
    static int players ( String team)
    {
        Scanner scanner=new Scanner(System.in);
        System.out.println("Input splayer's number:");
        int number=scanner.nextInt();
        System.out.println("input his kills:");
        int kill=scanner.nextInt();
        System.out.println("player"+number+" from team "+team+" has kills "+kill);
        String player="player"+number+ " from team "+team+" has kills "+kill;
        return kill;
    }


}
