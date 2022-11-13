package com.hillel.mashtalyar.homeworksecond.homework16;

import java.util.List;
import java.util.Map;
import java.util.Objects;
import java.util.stream.Collectors;

public class Main {
    public static void main(String[] args) {
        final List<String> lessons = List.of("Math", "History", "PI");
//        lessons.add("English"); //Exception in thread "main" java.lang.UnsupportedOperationException
//        lessons.clear();  //Exception in thread "main" java.lang.UnsupportedOperationException
        lessons.stream().map(e -> {
            System.out.println(e + " is lesson");
            return null;
        }).collect(Collectors.toList());


        final Map<String, Integer> numbersMap = Map.of("one", 1, "two", 2);
//        numbersMap.put("three",3); //Exception in thread "main" java.lang.UnsupportedOperationException

        final Human human = new Human();
//        human.name = human.getName() == null ?: human.setName("Serhii");

        String stringVar = null;
        String stringVar2 = "1";
        String checkStringVar=Objects.requireNonNullElse(stringVar,"One");
        String checkStringVar2=Objects.requireNonNullElse(stringVar2,"One");
        System.out.println(checkStringVar);
        System.out.println(checkStringVar2);

        String[]arr=new String[]{null,"One","Two"};
        String arrayVar=null;
        for (int i = 0; i < arr.length; i++) {
            System.out.println( Objects.requireNonNullElse(arr[i],"var is null"));
        }

        var string='0';
        System.out.println(string);
//        string=human.name; //error
        string=1;
        System.out.println(string); //выводится некоректно
        char[]charArray=new char[]{1, 'a','2',5};
        for (int i = 0; i < charArray.length; i++) {
            System.out.println(string= charArray[i]);
        }


        String name="Sergii";
        switch (name){
            case "Sergii"-> System.out.println(name+" Mashtalyar");
            case"Andrii"-> System.out.println(name+" Kozak");
            case"Anton"-> System.out.println(name+" Lush");
        }
int number=1;
        String personName=switch (number){
            case 1:yield "Mashtalyar";
            case 2:yield "Kozak";
            default:
                throw new IllegalStateException("Unexpected value: " + number);
        };
        System.out.println(personName);

        String secondPersonName=switch (name){
            case "Sergii"->"Mashtalyar";
            case "Andriy"->"Kozak";
            default -> throw new IllegalStateException("Unexpected value: " + number);
        };
        System.out.println(secondPersonName);

        String stringBlock="""
                               Я помню чудное мгновенье:
                               Передо мной явилась ты,
                               Как мимолётное виденье,
                               Как гений чистой красоты.
                               """;
        System.out.println(stringBlock);

        Record record=new Record("Andrii",19);
        System.out.println(record.name()+" is "+record.age());
    }
}
