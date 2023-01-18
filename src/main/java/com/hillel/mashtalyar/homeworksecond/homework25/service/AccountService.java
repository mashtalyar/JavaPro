package com.hillel.mashtalyar.homeworksecond.homework25.service;

import com.hillel.mashtalyar.homeworksecond.homework25.dao.AccountDao;
import com.hillel.mashtalyar.homeworksecond.homework25.dao.AccountDaoImpl;
import com.hillel.mashtalyar.homeworksecond.homework25.model.Account;
import org.apache.log4j.Logger;

public class AccountService {
    private final Logger logger=Logger.getLogger(AccountService.class);
    private final AccountDao accountDao = new AccountDaoImpl();

    public void save(Account account) {
        if (account == null) {
            System.out.println("Client is null");
        }
        logger.debug(account.toString());
        accountDao.save(account);
    }

    public void update(Account account) {
        logger.debug(account.toString());
        accountDao.update(account);
    }

    public void delete(Account account) {
        logger.debug(account.toString());
        accountDao.delete(account);
    }

    public Account getById(int id) {
        logger.debug(id);
        final Account account = accountDao.getById(id);
        return account;
    }
}
