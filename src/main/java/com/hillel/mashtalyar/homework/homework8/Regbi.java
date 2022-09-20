package com.hillel.mashtalyar.homework.homework8;

import java.util.Arrays;

public class Regbi {
    public static void main(String[] args) {
        int agemax=40;
        int agemin=18;
        int[] team1=new int [25];
        int[] team2=new int [25];
        double averageAgeTeam1=0;
        double averageAgeTeam2=0;
        for(int i=0;i< team1.length;i++)
        { team1[i] = (int) (agemin+Math.random() * 23);}
        System.out.println("Team1 age:"+Arrays.toString(team1));
        for(int i=0;i< team2.length;i++)
        { team2[i] = (int) (agemin+Math.random() * 23);}
        System.out.println("Team2 age:"+Arrays.toString(team2));
        for (int i=0;i<team1.length;i++) {
            averageAgeTeam1= averageAgeTeam1+team1[i];
        }
        System.out.println("Средний возраст команды 1: "+averageAgeTeam1/25);
        for (int i=0;i<team2.length;i++) {
            averageAgeTeam2= averageAgeTeam2+team2[i];}
        System.out.println("Средний возраст команды 2: "+averageAgeTeam2/25);
    }

}
