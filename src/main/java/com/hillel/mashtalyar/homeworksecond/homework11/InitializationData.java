package com.hillel.mashtalyar.homeworksecond.homework11;

import java.util.ArrayList;
import java.util.HashSet;

public class InitializationData {
    static Information information = new Information();

    static Information inputData() {
        for (int i = 0; i < 30; i++) {
            information.nickName.add("name" + i);
            information.email.add("email" + i + "@gmail.com");
            information.hashMap.put(information.email, information.nickName);
        }
        for (int a = 0; a < 10; a++) {
            information.nickName.add("sameName");
            information.email.add("sameEmail@gmail.com");
            information.hashMap.put(information.email, information.nickName);
        }
        HashSet<String> hashSet = new HashSet(information.nickName);
        information.nickName.clear();
        information.nickName = new ArrayList(hashSet);
        if (information.email.size() != information.nickName.size() || information.email.size() != information.hashMap.size()) {
            System.out.println("Sizes of email, nickname and hashmap are not the same");
        } else {
            System.out.println("Nickname size " + information.nickName.size());
            System.out.println("email size " + information.email.size());
            System.out.println("hashmap size " + information.hashMap.size());
        }
        return information;
    }
}
