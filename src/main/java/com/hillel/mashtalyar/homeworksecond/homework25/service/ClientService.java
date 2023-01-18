package com.hillel.mashtalyar.homeworksecond.homework25.service;

import com.hillel.mashtalyar.homeworksecond.homework25.dao.ClientDao;
import com.hillel.mashtalyar.homeworksecond.homework25.dao.ClientDaoImpl;
import com.hillel.mashtalyar.homeworksecond.homework25.model.Client;
import org.apache.log4j.Logger;

import java.util.List;

public class ClientService {
    private final Logger logger=Logger.getLogger(ClientService.class);
    private final ClientDao clientDao=new ClientDaoImpl();
    public void save(Client client) {
        if (client == null) {
            System.out.println("Client is null");
        }
        logger.debug(client.toString());
        clientDao.save(client);
    }
    public void update(Client client){
        logger.debug(client.toString());
        clientDao.update(client);
    }
    public void delete(Client client){
        logger.debug(client.toString());
        clientDao.delete(client);
    }
    public Client getById(int id) {
        logger.debug(id);
        final Client client = clientDao.getById(id);
        return client;
    }

    public List<Client> getByPhone(int phone) {
        final List<Client> client = clientDao.getByPhone(phone);
        logger.debug(client.toString());
        return client;
    }


}
