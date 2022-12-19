package com.hillel.mashtalyar.homeworksecond.homework24;

import com.hillel.mashtalyar.homeworksecond.homework24.entity.Account;
import com.hillel.mashtalyar.homeworksecond.homework24.entity.Client;
import com.hillel.mashtalyar.homeworksecond.homework24.entity.Status;
import com.hillel.mashtalyar.homeworksecond.homework24.service.AccountService;
import com.hillel.mashtalyar.homeworksecond.homework24.service.ClientService;
import com.hillel.mashtalyar.homeworksecond.homework24.service.StatusService;

import java.sql.Connection;
import java.sql.SQLException;
import java.util.List;

public class Main {
    public static void main(String[] args) throws SQLException {
//      final Connection connection= DataBase.getConnection();
        final ClientService clientService = new ClientService();
//        List<Client> clients = clientService.getAll();

        final AccountService accountService = new AccountService();
//        List<Account> accounts = accountService.getAll();

        final StatusService statusService = new StatusService();
//        List<Status> statuses = statusService.getAll();

//        System.out.println("----------Clients----------");
//        clients.forEach(System.out::println);

//        System.out.println("----------Accounts----------");
//        accounts.forEach(System.out::println);

//        System.out.println("----------Statuses----------");
//        statuses.forEach(System.out::println);

        Client client = new Client();
        client.setName("UPDATE TEST");
        client.setEmail("test@gmail.com");
        client.setPhone(412791921);
        client.setAbout("testing save method");

//        clientService.save(client);

//        clientService.delete();

//        clientService.update(client);

//        List<Client> clientsInPhone = clientService.getInPhone();
//        clientsInPhone.forEach(System.out::println);

//        accountService.getOnValue(30.0);

//        List<Client> getAllOnId = clientService.getAllOnId();
//        getAllOnId.forEach(System.out::println);

        List<Client> getFrom2Tables = clientService.getFrom2Tables();
        getFrom2Tables.forEach(System.out::println);
    }
}
