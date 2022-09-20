package com.hillel.mashtalyar.homework.homework5;



public class Airfactory {
    public static void main(String[] args) {
        String type = "Jet";
        String name = "F52";
        int firstClassPassengers = 25;
        int secondClassPassengers = 300;
        System.out.println(buildAirplane(type, name));
        System.out.println(buildAirplane(secondClassPassengers));
        System.out.println(buildAirplane(firstClassPassengers,secondClassPassengers));
    }

    static String buildAirplane(String type, String name) {
        String result = type + name;
        return result;
    }
    static String buildAirplane( int secondClassPassengers){
        String result2= "Boeing,"+"747,"  + secondClassPassengers;
        return result2;
    }
    static String buildAirplane(int firstClassPassengers, int secondClassPassengers){
        String result3= "Boeing,"+"747,"  + secondClassPassengers+" ,"+firstClassPassengers;
        return result3;
   }

}