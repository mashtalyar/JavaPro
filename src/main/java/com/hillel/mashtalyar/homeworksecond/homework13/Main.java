package com.hillel.mashtalyar.homeworksecond.homework13;

import java.util.Optional;

import static com.hillel.mashtalyar.homeworksecond.homework13.First.staticMethodFirst;
import static com.hillel.mashtalyar.homeworksecond.homework13.Fourth.staticMethodFourth;
import static com.hillel.mashtalyar.homeworksecond.homework13.Helper.helper;
import static com.hillel.mashtalyar.homeworksecond.homework13.Second.staticMethodSecond;
import static com.hillel.mashtalyar.homeworksecond.homework13.Third.staticMethodThird;

public class Main {
    public static void main(String[] args) {
        final FirstClass firstClass = new FirstClass();
        firstClass.defaultMethod();
        staticMethodFirst();
        staticMethodSecond();
        firstClass.methodFirst("Serhii");
        firstClass.methodSecond("Mashtalyar");

        final SecondClass secondClass = new SecondClass();
        secondClass.defaultMethod();
        staticMethodThird();
        staticMethodFourth();
        secondClass.methodFirst("Andriy");
        secondClass.methodSecond("Dmitrenco");

        System.out.println(helper("serg49049@gmail.com")); //6. Вызвать в классе Main этот хелпер передав валидное значение и получить его;

        final Optional optional= (Optional) helper("132132"); //7. Вызвать в классе Main этот хелпер передав не валидное значение и вызвать ошибку используя Optional функции, пытаясь получить значение из вернувшегося результата (метод get);
        optional.get();
    }
}

