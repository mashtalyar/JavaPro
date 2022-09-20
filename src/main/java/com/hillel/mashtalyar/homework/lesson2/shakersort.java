package com.hillel.mashtalyar.homework.lesson2;


import java.util.Arrays;

public class shakersort {
    public static void main(String[] args) {
        int[] array = new int[20];
        for(int i=0; i<array.length;i++){
            array[i]=(int)(Math.random()*21);
        }
        System.out.println("mass before sort"+Arrays.toString(array));
        for (int i = 0; i < array.length / 2; i++) {
            boolean swapped = false;
            for (int j = i; j < array.length - i - 1; j++) {
                if (array[j] < array[j + 1]) {
                    int tmp = array[j];
                    array[j] = array[j + 1];
                    array[j + 1] = tmp;
                    swapped = true;
                }
            }
            for (int j = array.length - 2 - i; j > i; j--) {

                if (array[j] > array[j - 1]) {
                    int tmp = array[j];
                    array[j] = array[j - 1];
                    array[j - 1] = tmp;
                    swapped = true;
                }
            }
            if (!swapped) break;
            System.out.println(Arrays.toString(array));
        }
        System.out.println("mass after sort"+Arrays.toString(array));
    }
}