package com.hillel.mashtalyar.homeworksecond.homework25.dao;

import com.hillel.mashtalyar.homeworksecond.homework25.model.Account;
import com.hillel.mashtalyar.homeworksecond.homework25.model.Status;
import com.hillel.mashtalyar.homeworksecond.homework25.util.HibernateUtil;
import com.hillel.mashtalyar.homeworksecond.homework25.util.HibernateUtilAcc;
import com.hillel.mashtalyar.homeworksecond.homework25.util.HibernateUtilStatus;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;

public class StatusDaoImpl implements StatusDao{
    public void save(Status status) {
        final SessionFactory sessionFactory = HibernateUtilStatus.getSessionFactory();
        final Session session = sessionFactory.openSession();
        final Transaction transaction = session.beginTransaction();

        session.save(status);

        transaction.commit();
        session.close();
    }

    @Override
    public void delete(Status status) {
        final SessionFactory sessionFactory = HibernateUtilStatus.getSessionFactory();
        final Session session = sessionFactory.openSession();
        final Transaction transaction = session.beginTransaction();

        session.delete(status);

        transaction.commit();
        session.close();
    }

    @Override
    public void update(Status status) {
        final SessionFactory sessionFactory = HibernateUtilStatus.getSessionFactory();
        final Session session = sessionFactory.openSession();
        final Transaction transaction = session.beginTransaction();

        session.update(status);

        transaction.commit();
        session.close();
    }

    @Override
    public Status getById(int id) {
        final SessionFactory sessionFactory = HibernateUtilStatus.getSessionFactory();
        final Session session = sessionFactory.openSession();
        final Transaction transaction = session.beginTransaction();

        final Status status = session.get(Status.class, id);

        transaction.commit();
        session.close();

        return status;
    }
}
