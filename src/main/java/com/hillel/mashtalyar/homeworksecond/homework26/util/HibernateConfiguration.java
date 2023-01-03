package com.hillel.mashtalyar.homeworksecond.homework26.util;


import com.hillel.mashtalyar.homeworksecond.homework26.entity.Client;
import com.hillel.mashtalyar.homeworksecond.homework26.entity.Homework;
import com.hillel.mashtalyar.homeworksecond.homework26.entity.Lesson;
import com.hillel.mashtalyar.homeworksecond.homework26.entity.Wallet;
import org.hibernate.SessionFactory;
import org.hibernate.boot.registry.StandardServiceRegistryBuilder;
import org.hibernate.cfg.Configuration;

public class HibernateConfiguration {
    private static SessionFactory sessionFactory;

    public static SessionFactory getSessionFactory() {
        if (sessionFactory == null) {
            try {
                Configuration configuration = new Configuration().configure();
                configuration.addAnnotatedClass(Client.class);
                configuration.addAnnotatedClass(Homework.class);
                configuration.addAnnotatedClass(Lesson.class);
                configuration.addAnnotatedClass(Wallet.class);

                StandardServiceRegistryBuilder builder = new StandardServiceRegistryBuilder()
                        .applySettings(configuration.getProperties());
                sessionFactory = configuration.buildSessionFactory(builder.build());
            } catch (Exception e) {
                System.out.println("Session factory Error: " + e);
            }
        }
        return sessionFactory;
    }
}
