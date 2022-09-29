package com.hillel.mashtalyar.homeworksecond.homework5;

public class StringHelper {


   public static String stringCheck(String inputString, char[] array){

if(array.length==0){
   System.out.println("Array is null");
   System.exit(0);
}

String stringFromArray = new String(array);

if(inputString.isBlank()||stringFromArray.isBlank()){
    System.out.println("One or two strings is empty");
    System.exit(0);
}
if(inputString.isBlank()==false && stringFromArray.isBlank()==false){
    inputString.toUpperCase();
    stringFromArray.toLowerCase();
}
inputString.trim();
stringFromArray.trim();
String finalString=inputString.concat(" ").concat(stringFromArray);
       System.out.println("String"+finalString);
if(finalString.length()%2==0){
    finalString= finalString.substring(finalString.length()/2-1,finalString.length()/2+1);
}
else {
   finalString=finalString.substring( (finalString.length()/2),finalString.length()/2+1);
}


      return finalString;
   }
}
