package com.hillel.mashtalyar.homeworksecond.homework5;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class StringCheck {
    public static boolean checkPhone(String phone){
         return phone.matches("(.*)+380(.*)");
    }

    public static boolean checkEmail(String email){
        return email.matches("(.*)@(.*)");
    }
    public static boolean checkDate(String date){
        final Pattern pattern = Pattern.compile("(.+)[0-9]");
        final Matcher matcher = pattern.matcher(date);
        final boolean find = matcher.find();
        return find;

    }

}
