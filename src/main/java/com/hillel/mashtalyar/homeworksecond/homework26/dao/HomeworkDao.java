package com.hillel.mashtalyar.homeworksecond.homework26.dao;


import com.hillel.mashtalyar.homeworksecond.homework26.entity.Homework;
import com.hillel.mashtalyar.homeworksecond.homework26.util.HibernateConfiguration;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;

public class HomeworkDao {
    public void save(Homework homework) {
        final SessionFactory sessionFactory = HibernateConfiguration.getSessionFactory();
        final Session session = sessionFactory.openSession();
        final Transaction transaction = session.beginTransaction();

        session.save(homework);

        transaction.commit();
        session.close();
    }
}
