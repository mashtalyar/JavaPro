package com.hillel.mashtalyar.homeworksecond.homework11;

import java.util.ArrayList;

import static com.hillel.mashtalyar.homeworksecond.homework11.InitializationData.information;

public class Main {
    static Information processingData(ArrayList<Number> list, Information information) {
        for (Number number : list) {
            list.toString();
            information.nickName.add(String.valueOf(list));
        }
        String string;
        int i = 0;
        for (Number number : list) {
            string = String.valueOf(list.get(i));
            string = string + "@mail.ua";
            information.email.add(string);
            if (information.hashMap.containsKey(string)) {
                System.out.println("Email:" + string + "had already add");
            }
            information.hashMap.put(information.email, information.nickName);
            i++;
        }
        System.out.println("Email after processing"+information.email);
        System.out.println("NickName after processing"+information.nickName);
        System.out.println("HashMap after processing"+information.hashMap);
        return information;
    }

    public static void main(String[] args) {
        InitializationData.inputData();
        ArrayList<Number> arrayList = new ArrayList<>();
        arrayList.add(1);
        arrayList.add(2);
        arrayList.add(3);
        arrayList.add(4);
        arrayList.add(5);
        processingData(arrayList, information);

    }
}
