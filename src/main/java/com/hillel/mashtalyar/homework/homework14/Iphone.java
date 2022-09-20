package com.hillel.mashtalyar.homework.homework14;

public class Iphone implements Smartphones,IOS{
    @Override
    public void ios() {
        System.out.println("IOS started...");
    }
    @Override
    public void call() {
        System.out.println("Iphone call...");
    }

    @Override
    public void sms() {
        System.out.println("Iphone get sms...");
    }

    @Override
    public void internet() {
        System.out.println("Iphone has connect to Internet..");
    }


    void startWork(){
        ios();
        call();
        sms();
        internet();

    }
}
