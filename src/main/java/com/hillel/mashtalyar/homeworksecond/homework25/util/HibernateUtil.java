package com.hillel.mashtalyar.homeworksecond.homework25.util;

import com.hillel.mashtalyar.homeworksecond.homework25.model.Account;
import com.hillel.mashtalyar.homeworksecond.homework25.model.Client;
import com.hillel.mashtalyar.homeworksecond.homework25.model.Status;
import com.hillel.mashtalyar.homeworksecond.homework25.service.StatusService;
import lombok.ToString;
import org.apache.log4j.Logger;
import org.hibernate.SessionFactory;
import org.hibernate.boot.registry.StandardServiceRegistryBuilder;
import org.hibernate.cfg.Configuration;

@ToString
public class HibernateUtil {
    private static final Logger logger=Logger.getLogger(HibernateUtil.class);
    private static SessionFactory sessionFactory;
    public static SessionFactory getSessionFactory() {
        logger.error(sessionFactory);
        if (sessionFactory == null) {
            try {
                Configuration configuration = new Configuration().configure();
                configuration.addAnnotatedClass(Client.class);
                configuration.addAnnotatedClass(Account.class);
                configuration.addAnnotatedClass(Status.class);
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
