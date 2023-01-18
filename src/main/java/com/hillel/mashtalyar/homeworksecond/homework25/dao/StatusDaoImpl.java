package com.hillel.mashtalyar.homeworksecond.homework25.dao;

import com.hillel.mashtalyar.homeworksecond.homework25.model.Status;
import com.hillel.mashtalyar.homeworksecond.homework25.util.HibernateUtil;
import org.apache.log4j.Logger;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;

public class StatusDaoImpl implements StatusDao{
    private final Logger logger=Logger.getLogger(StatusDaoImpl.class);
    public void save(Status status) {
        final SessionFactory sessionFactory = HibernateUtil.getSessionFactory();
        final Session session = sessionFactory.openSession();
        final Transaction transaction = session.beginTransaction();

        session.save(status);

        transaction.commit();
        session.close();
        logger.debug(status.toString());
    }

    @Override
    public void delete(Status status) {
        final SessionFactory sessionFactory = HibernateUtil.getSessionFactory();
        final Session session = sessionFactory.openSession();
        final Transaction transaction = session.beginTransaction();

        session.delete(status);

        transaction.commit();
        session.close();
        logger.debug(status.toString());
    }

    @Override
    public void update(Status status) {
        final SessionFactory sessionFactory = HibernateUtil.getSessionFactory();
        final Session session = sessionFactory.openSession();
        final Transaction transaction = session.beginTransaction();

        session.update(status);

        transaction.commit();
        session.close();
        logger.debug(status.toString());
    }

    @Override
    public Status getById(int id) {
        final SessionFactory sessionFactory = HibernateUtil.getSessionFactory();
        final Session session = sessionFactory.openSession();
        final Transaction transaction = session.beginTransaction();

        final Status status = session.get(Status.class, id);

        transaction.commit();
        session.close();
        logger.debug(id);

        return status;
    }
}
