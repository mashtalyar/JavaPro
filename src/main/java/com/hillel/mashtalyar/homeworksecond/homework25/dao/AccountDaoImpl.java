package com.hillel.mashtalyar.homeworksecond.homework25.dao;

import com.hillel.mashtalyar.homeworksecond.homework25.model.Account;
import com.hillel.mashtalyar.homeworksecond.homework25.model.Client;
import com.hillel.mashtalyar.homeworksecond.homework25.util.HibernateUtil;
import com.hillel.mashtalyar.homeworksecond.homework25.util.HibernateUtilAcc;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;

public class AccountDaoImpl implements AccountDao{
    public void save(Account account) {
        final SessionFactory sessionFactory = HibernateUtilAcc.getSessionFactory();
        final Session session = sessionFactory.openSession();
        final Transaction transaction = session.beginTransaction();

        session.save(account);

        transaction.commit();
        session.close();
    }

    @Override
    public void delete(Account account) {
        final SessionFactory sessionFactory = HibernateUtilAcc.getSessionFactory();
        final Session session = sessionFactory.openSession();
        final Transaction transaction = session.beginTransaction();

        session.delete(account);

        transaction.commit();
        session.close();
    }

    @Override
    public void update(Account account) {
        final SessionFactory sessionFactory = HibernateUtilAcc.getSessionFactory();
        final Session session = sessionFactory.openSession();
        final Transaction transaction = session.beginTransaction();

        session.update(account);

        transaction.commit();
        session.close();
    }

    @Override
    public Account getById(int id) {
        final SessionFactory sessionFactory = HibernateUtilAcc.getSessionFactory();
        final Session session = sessionFactory.openSession();
        final Transaction transaction = session.beginTransaction();

        final Account account = session.get(Account.class, id);

        transaction.commit();
        session.close();

        return account;
    }
}
