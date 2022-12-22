package com.hillel.mashtalyar.homeworksecond.homework25;

import com.hillel.mashtalyar.homeworksecond.homework25.model.Client;
import com.hillel.mashtalyar.homeworksecond.homework25.service.ClientService;

import java.util.List;

public class Main {
    public static void main(String[] args) {
        final ClientService clientService = new ClientService();
//        Client client = new Client();
//        client.setName("Bob");
//        client.setEmail("bob@mail.com");
//        client.setPhone(42034232);
//        client.setAbout("test");
//        client.setAge(15);
//        clientService.save(client);
//        final Client clientById=clientService.getById(4);
//        System.out.println(clientById.toString());

        final List clientByPhone=clientService.getByPhone(44);
        System.out.println(clientByPhone.toString());
    }
}
