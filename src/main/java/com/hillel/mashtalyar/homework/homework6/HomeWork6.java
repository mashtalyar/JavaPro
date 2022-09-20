package com.hillel.mashtalyar.homework.homework6;

import java.util.Scanner;

public class HomeWork6{
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("input first team name:");
        String team1name = scanner.next();
        System.out.println("first team:" + team1name);
        double team1Score=team1(team1name);
        System.out.println("input second team name:");
        String team2name = scanner.next();
        System.out.println("first team:" + team2name);
        double team2Score=team2(team2name);
if (team1Score>team2Score ){
    System.out.println("Победила команда " + team1name + " набравшая " +team1Score + " очков");
}
else if (team1Score==team2Score) {
            System.out.println("Ничья co счетом "+team1Score+":"+team2Score);
}
else {
    System.out.println("Победила команда " + team2name + " набравшая " +team2Score + " очков");
}
    }
    static double team1(String name){
        Scanner scanner = new Scanner(System.in);
        System.out.println("input score player1:");
        int score1=scanner.nextInt();
        System.out.println("input score player2:");
        int score2=scanner.nextInt();
        System.out.println("input score player3:");
        int score3=scanner.nextInt();
        System.out.println("input score player4:");
        int score4=scanner.nextInt();
        System.out.println("input score player5:");
        int score5=scanner.nextInt();
        double team1score=(double) (score1+score2+score3+score4+score5)/5;
        System.out.println("team "+name+" score="+team1score);
        return  team1score;
    }
    static double team2(String name){
        Scanner scanner = new Scanner(System.in);
        System.out.println("input score player1:");
        int score1=scanner.nextInt();
        System.out.println("input score player2:");
        int score2=scanner.nextInt();
        System.out.println("input score player3:");
        int score3=scanner.nextInt();
        System.out.println("input score player4:");
        int score4=scanner.nextInt();
        System.out.println("input score player5:");
        int score5=scanner.nextInt();
        double team2score=(double) (score1+score2+score3+score4+score5)/5;
        System.out.println("team "+name+" score="+team2score);
        return  team2score;
    }
}











