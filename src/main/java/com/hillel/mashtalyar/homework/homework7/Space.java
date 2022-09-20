package com.hillel.mashtalyar.homework.homework7;

public class Space {
    public static void main(String[] args) {

        int shatl = 1, value = 0;
        while (shatl < 101) {
            String numbers = String.valueOf(++value);
            if ((numbers.contains("4") || numbers.contains("9"))) continue;
            System.out.println("шаттл "+shatl+" имеет номер"+value);
            shatl++;
        }
    }
}
