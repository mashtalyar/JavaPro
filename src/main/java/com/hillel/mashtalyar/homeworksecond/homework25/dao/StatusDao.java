package com.hillel.mashtalyar.homeworksecond.homework25.dao;

import com.hillel.mashtalyar.homeworksecond.homework25.model.Account;
import com.hillel.mashtalyar.homeworksecond.homework25.model.Status;

public interface StatusDao {
    void save(Status status);
    void delete(Status status);
    void update(Status status);
    Status getById(int id);
}
