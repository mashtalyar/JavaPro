package com.hillel.mashtalyar.homework.homework3;

public class HomeWork3 {
    public static void main(String[] args) {
        int warriorLi=13;
        int archerLi=24;
        int riderLi=46;
        int warriorMin=9;
        int archerMin=35;
        int riderMin=12;
        double powerLi= (double)(warriorLi+archerLi+riderLi)*860;
        double powerMin= (double)(warriorMin+archerMin+riderMin)*860*1.5;
        System.out.println("powerLi=" +powerLi);
        System.out.println("powerMin=" +powerMin);
    }

}
