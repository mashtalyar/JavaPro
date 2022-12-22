package com.hillel.mashtalyar.homeworksecond.homework25.service;

import com.hillel.mashtalyar.homeworksecond.homework25.dao.ClientDao;
import com.hillel.mashtalyar.homeworksecond.homework25.dao.ClientDaoImpl;
import com.hillel.mashtalyar.homeworksecond.homework25.model.Client;

import java.util.List;

public class ClientService {
    private final ClientDao clientDao=new ClientDaoImpl();
    public void save(Client client) {
        if (client == null) {
            System.out.println("Client is null");
        }
        clientDao.save(client);
    }
    public void update(Client client){
        clientDao.update(client);
    }
    public void delete(Client client){
        clientDao.delete(client);
    }
    public Client getById(int id) {
        final Client client = clientDao.getById(id);
        return client;
    }

    public List<Client> getByPhone(int phone) {
        final List<Client> client = clientDao.getByPhone(phone);
        return client;
    }


}
