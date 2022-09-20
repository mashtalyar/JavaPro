package com.hillel.mashtalyar.homework.lesson2;

import java.util.Arrays;

public class Lesson2 {
    public static void main(String[] args) {

        int N = 5;
        int twoD[][] = new int[N][N];
        int i, j = 0;

        for (i = 0; i < N; i++){
            for (j = 0; j < N; j++) {
                twoD[i][j] = 0;}
            twoD[i][i]=1;
            }
        for (i = 0; i < N; i++) {
            for (j = 0; j < N; j++)
                System.out.print(twoD[i][j] + "  ");
            System.out.println();
        }
    }
}