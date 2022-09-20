package com.hillel.mashtalyar.homework.homework14;

public class Android implements Smartphones, LinuxOS{
    @Override
    public void linux() {
        System.out.println("LinuxOS started...");
    }
    @Override
    public void call() {
        System.out.println("Android call...");
    }

    @Override
    public void sms() {
        System.out.println("Android get sms...");
    }

    @Override
    public void internet() {
        System.out.println("Android has connect to Internet..");
    }

void startWork(){
        linux();
        call();
        sms();
        internet();

}
}
