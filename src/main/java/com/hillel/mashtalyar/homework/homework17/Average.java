package com.hillel.mashtalyar.homework.homework17;

public class Average {

    public  static  double testAverage(int[] arr) {
        double sum = 0;
        int count = 0;
        for (int i = 0; i < arr.length; i++) {
                sum += arr[i];
                
            }
        return (double) (sum/arr.length);
    }
}
