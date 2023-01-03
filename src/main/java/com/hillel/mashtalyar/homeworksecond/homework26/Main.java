package com.hillel.mashtalyar.homeworksecond.homework26;

import com.hillel.mashtalyar.homeworksecond.homework26.entity.Client;
import com.hillel.mashtalyar.homeworksecond.homework26.entity.Homework;
import com.hillel.mashtalyar.homeworksecond.homework26.entity.Lesson;
import com.hillel.mashtalyar.homeworksecond.homework26.entity.Wallet;
import com.hillel.mashtalyar.homeworksecond.homework26.service.HomeworkService;

import java.util.HashSet;

public class Main {
    public static void main(String[] args) {
        HomeworkService homeworkService = new HomeworkService();

        final Homework homework = new Homework();
        homework.setTitle("Hibernate");
        Client client = new Client();
        client.setName("HibernateTEST");
        client.setEmail("hiberTest@email.com");
        client.setPhone(430432);
        client.setAbout("hiberTest");
        client.setAge(100);
        final HashSet<Lesson> lessons = new HashSet<>();
        final HashSet<Client> clients = new HashSet<>();
        clients.add(client);
        final Wallet wallet = new Wallet();
        wallet.setAmount(200.4);
        wallet.setClient(client);
        client.setWallet(wallet);
        client.setLessons(new HashSet<>());
        homework.setClient(client);

        homeworkService.save(homework);
    }
}
