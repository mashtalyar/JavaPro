package com.hillel.mashtalyar.homework.homework11;

import java.util.Scanner;

public class Arrays {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int N=inputData(scanner);
        int M=inputData(scanner);
        int[][] firstArray=new int[N][M];
        for (int i = 0; i < firstArray.length; i++) {
            for (int j = 0; j < firstArray[i].length; j++) {
                firstArray[i][j] = (int) (Math.random() * 101);
            }
        }
        System.out.println(" Array before transposed:");
        for (int i = 0; i < firstArray.length; i++) {
            for (int j = 0; j < firstArray[i].length; j++) {
                System.out.print(firstArray[i][j] + "\t");
            }
            System.out.println();
        }
        System.out.println("________________________");
        int[][] transposedArray = new int[M][N];
        System.out.println("Array after transposed:");
        for (int i = 0; i < transposedArray.length; i++) {
            for (int j = 0; j < transposedArray[i].length; j++) {
                transposedArray[i][j] = firstArray[j][i];
                System.out.print(transposedArray[i][j] + "\t ");
            }
            System.out.println();
        }


    }
    static int inputData(Scanner scanner) {
        System.out.println("Enter size of array: ");
        while (true) {
            if (scanner.hasNextInt()) {
                return scanner.nextInt();
            } else {
                System.out.println("Wrong data. Try again");
                scanner.nextLine();
            }
        }
    }
}
