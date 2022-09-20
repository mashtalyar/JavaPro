package com.hillel.mashtalyar.homework.homework17;

public class Matrix {
    public static  boolean testMatrix( int[][] array) {
        boolean test;
        if (array.length==array[0].length) {
           test=true;
        } else {
           test=false;
        }
        return test;
    }

}
