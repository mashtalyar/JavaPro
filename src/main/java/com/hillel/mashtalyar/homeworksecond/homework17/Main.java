package com.hillel.mashtalyar.homeworksecond.homework17;

import java.util.concurrent.Callable;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.FutureTask;

public class Main {
    public static void main(String[] args) throws ExecutionException, InterruptedException {
        final ThreadClass threadClass = new ThreadClass();
        threadClass.start();
        threadClass.join();

        final RunnableClass runnableClass = new RunnableClass();
        final Thread runnableClassThread = new Thread(runnableClass);
        runnableClassThread.start();
        runnableClassThread.join();

        final CallableClass callableClass=new CallableClass();
        final FutureTask<String> FutureTask = new FutureTask<>(callableClass);
        final Thread threadnumb=new Thread(FutureTask);
        threadnumb.start();
        threadnumb.join();
        final String result = FutureTask.get();
        System.out.println("CustomCallable result is: " + result);

    //p5.1 после 5 запусков программы диапазон переменной 3000-3000
        //p5.2 после добавления синхранизации и 5 запусков программы диапазон переменной 3000-3000
            //p5.3 после добавления синхранизации,.join() и 5 запусков программы диапазон переменной 3000-3000
    }
}
