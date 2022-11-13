package org.example;

import org.example.Models.Task;
import org.example.Models.Topic;
import org.example.Models.User;
import org.hibernate.SessionFactory;
import org.hibernate.boot.registry.StandardServiceRegistryBuilder;
import org.hibernate.cfg.Configuration;

public class HibernateSessionGet {
    private static SessionFactory sessionFactory =null;
    HibernateSessionGet(){}

    public static SessionFactory GetSessionFactory(){
        if (sessionFactory == null) {
            Configuration config = new Configuration().configure();
            config.addAnnotatedClass(Topic.class);
            config.addAnnotatedClass(User.class);
            config.addAnnotatedClass(Task.class);

            StandardServiceRegistryBuilder builder = new StandardServiceRegistryBuilder()
                    .applySettings(config.getProperties());
            sessionFactory = config.buildSessionFactory(builder.build());
        }
        return sessionFactory;
    }
}
