package com.hillel.mashtalyar.homeworksecond.homework25.dao;

import com.hillel.mashtalyar.homeworksecond.homework25.model.Client;
import com.hillel.mashtalyar.homeworksecond.homework25.util.HibernateUtil;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;

import javax.persistence.Query;
import java.util.List;

public class ClientDaoImpl implements  ClientDao{
    @Override
     public void save(Client client) {
        final SessionFactory sessionFactory = HibernateUtil.getSessionFactory();
        final Session session = sessionFactory.openSession();
        final Transaction transaction = session.beginTransaction();

        session.save(client);

        transaction.commit();
        session.close();
    }

    @Override
    public void delete(Client client) {
        final SessionFactory sessionFactory = HibernateUtil.getSessionFactory();
        final Session session = sessionFactory.openSession();
        final Transaction transaction = session.beginTransaction();

        session.delete(client);

        transaction.commit();
        session.close();
    }

    @Override
    public void update(Client client) {
        final SessionFactory sessionFactory = HibernateUtil.getSessionFactory();
        final Session session = sessionFactory.openSession();
        final Transaction transaction = session.beginTransaction();

        session.update(client);

        transaction.commit();
        session.close();
    }

    @Override
    public Client getById(int id) {
        final SessionFactory sessionFactory = HibernateUtil.getSessionFactory();
        final Session session = sessionFactory.openSession();
        final Transaction transaction = session.beginTransaction();

        final Client client = session.get(Client.class, id);

        transaction.commit();
        session.close();

        return client;
    }

    public List<Client> getByPhone(int phone) {
        final SessionFactory sessionFactory = HibernateUtil.getSessionFactory();
        final Session session = sessionFactory.openSession();
        final Transaction transaction = session.beginTransaction();

        Query query= session.createQuery("from Client where phone= :paramPhone");
        query.setParameter("paramPhone", phone);
        List clients = ((org.hibernate.query.Query<?>) query).list();

        transaction.commit();
        session.close();

        return clients;
    }



}
