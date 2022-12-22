package com.hillel.mashtalyar.homeworksecond.homework25.dao;

import com.hillel.mashtalyar.homeworksecond.homework25.model.Client;

import java.util.List;

public interface ClientDao {
     void save(Client client);
     void delete(Client client);
     void update(Client client);
     Client getById(int id);
     List<Client> getByPhone(int phone);

}
