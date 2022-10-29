package com.hillel.mashtalyar.homeworksecond.homework14;

import java.util.function.*;

public class Main {
    public static void main(String[] args) {
        System.out.println("Predicate");
        final Predicate<Double> predicate = (salary) -> salary > 1500;
        System.out.println(predicate.test(1500.4));
        System.out.println(predicate.test(101.1));

        System.out.println("\nConsumer");
        final Consumer<String> consumer = (string) -> {
            char[] array = string.toCharArray();
            for (int i = 0; i < array.length; i++)
                System.out.print(array[i] + "*");
            System.out.println();
        };
        consumer.accept("sergii");

        System.out.println("\nFunctional");
        final Function<Integer, String> function = (intNumber) -> {
            switch (intNumber) {
                case 1:
                    System.out.println("first");
                    break;
                case 2:
                    System.out.println("second");
                    break;
                case 3:
                    System.out.println("third");
                    break;
                case 4:
                    System.out.println("fourth");
                    break;
                case 5:
                    System.out.println("fifth");
                    break;
                case 6:
                    System.out.println("sixth");
                    break;
                case 7:
                    System.out.println("seventh");
                    break;
                case 8:
                    System.out.println("eight");
                    break;
                case 9:
                    System.out.println("ninety");
                    break;
                case 10:
                    System.out.println("tenth");
                    break;
                default:
                    System.out.println("unknown");
                    break;
            }
            return null;
        };
        function.apply(1);
        function.apply(10);
        function.apply(11);

        System.out.println("\nSupplier");
        final Supplier<Integer> supplier = () -> (int) (Math.random() * 101);
        final int randomNumber = supplier.get();
        System.out.println(randomNumber);

        System.out.println("\nBiFunctional");
        final BiFunction<Double, Integer, String> biFunction = (doubleNumber, intNumber) -> {
            String str;
            if ((doubleNumber - intNumber) > 1) {
                str = "Number:".concat(String.valueOf(doubleNumber - intNumber));
            } else {
                str = "Number < 1";
            }
            return str;
        };
        System.out.println(biFunction.apply(4.5, 1));
        System.out.println(biFunction.apply(1.1,1));

        System.out.println("\nFiveDigitFunction");
        final FiveDigitFunction fiveDigitFunction = (num1, num2, num3, num4) -> {
            String string;
            string = String.valueOf(num1 + num2 + num3 + num4);
            return string;
        };
        System.out.println(fiveDigitFunction.fiveDigitFunction(1, 2, 3, 4));

        System.out.println("\nDoubleBinaryOperator");
        final DoubleBinaryOperator doubleBinaryOperator = (a, b) -> a * b;
        System.out.println(doubleBinaryOperator.applyAsDouble(0.45, 0.33));

    }
}
