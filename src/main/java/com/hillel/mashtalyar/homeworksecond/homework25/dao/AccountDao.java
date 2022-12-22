package com.hillel.mashtalyar.homeworksecond.homework25.dao;

import com.hillel.mashtalyar.homeworksecond.homework25.model.Account;


public interface AccountDao {
    void save(Account account);
    void delete(Account account);
    void update(Account account);
    Account getById(int id);
}
