package com.hillel.mashtalyar.homeworksecond.homework15;

import java.util.*;
import java.util.function.Function;
import java.util.function.Supplier;
import java.util.stream.Collectors;
import java.util.stream.Stream;

import static com.hillel.mashtalyar.homeworksecond.homework15.Car.getMark;


public class Main {
    static Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {

        final Stream<String> firstStream = Stream.empty();
        firstStream.map(e -> e + "_workWithStreams")
                .filter(e -> e.length() > 5)
                .forEach(e -> System.out.println(e.length()));

        String[] arr = {"My", "name", "is", "is", "Mikel", "Jordan", "j"};
        final Stream<String> arrayStream = Arrays.stream(arr);
        arrayStream.filter(e -> e.length() > 1).distinct().forEach(str -> System.out.print(str + " "));

        final List<String> theardStream = Stream.of("One", "two", "1", "2", "Hello", "world").collect(Collectors.toList());

        System.out.println("");
        HashMap hashMap = new HashMap();
        hashMap.put(1, "one");
        hashMap.put(2, "two");
        hashMap.put(3, "three");
        final Stream mapStream = hashMap.keySet().stream();
        mapStream.map(key -> {
            System.out.println(hashMap.get(key));
            return key;
        }).collect(Collectors.toList());


//        final List<String>stringStream=Arrays.asList("1","2","3","4","5","6","7","8","9","10");
//        stringStream.stream().skip(1).limit(8).mapToInt(e->Integer.parseInt(e)).filter(e->e%2==0).collect(Collectors.toSet());
//PS Так и не смог разобрать с этой проблемой, коорую описал в Slack. Буду пытаться найти решение выполняя работу над ошибками и тренируясь еще работать со стимами

        Stream<Integer> numbersStream = Stream.of(1, 2, 3, 4, 5, 6);
        Optional<Integer> result = numbersStream.parallel().sorted().filter(e -> e > 3).findFirst();


        ArrayList arrayListCar = new ArrayList<>();
        arrayListCar.stream().map(e -> {
            System.out.println("Car" + functionStringMethod + "has Wheals" + supplierMethod);
            return carVar;
        }).collect(Collectors.toList());
    }

    static final Function<String, Integer> function = Integer::parseInt;

    static final Integer integer = function.apply(inputData(scanner));
    static Supplier<String> supplier = integer::toString;
    static final String supplierMethod = supplier.get();

    static final Function<String, String> functionString = String::toUpperCase;
    static final String functionStringMethod = functionString.apply(getMark());

    static final Function<String, Car> userFunction = Car::new;
    static final Car carVar = userFunction.apply(functionStringMethod);

    static String inputData(Scanner scanner) {
        System.out.println("Enter number of car's wheals: ");
        while (true) {
            if (scanner.hasNextLine()) {
                return scanner.nextLine();
            } else {
                System.out.println("Wrong data. Try again");
                scanner.nextLine();
            }
        }
    }
}
