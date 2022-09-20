package com.hillel.mashtalyar.homework.homework5.homework9;

import java.util.Arrays;

public class Casino {
    public static void main(String[] args) {
        int[] casino = new int[7];
        int[] player = new int[7];
        for (int i = 0; i < casino.length; i++) {
            casino[i] = (int) (Math.random() * 10);
        }
        for (int j = 0; j < player.length; j++) {
            player[j] = (int) (Math.random() * 10);
        }
        Arrays.sort(casino);
        Arrays.sort(player);
        System.out.println(Arrays.toString(casino));
        System.out.println(Arrays.toString(player));
        int score = 0;
        for (int c = 0; c < casino.length || c < player.length; c++) {
            if (casino[c] == player[c]) {
                System.out.println("Совпали элемнты номер:"+(c+1));
                score++;
            }
        }
        System.out.println("Количство совпадений:" + score);
    }
}
