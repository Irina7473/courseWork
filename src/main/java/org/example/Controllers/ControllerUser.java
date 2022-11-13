package org.example.Controllers;

import org.example.HibernateSessionGet;
import org.example.Models.User;
import org.hibernate.Session;
import org.hibernate.Transaction;

import java.util.List;

public class ControllerUser {
    public ControllerUser(){}

    public boolean addUser (User user ){
        Session session = HibernateSessionGet.GetSessionFactory().openSession();
        Transaction tx= session.beginTransaction();
        session.persist(user);
        tx.commit();
        session.close();
        return true;
    }

    public User getUserById (int id){
        Session session = HibernateSessionGet.GetSessionFactory().openSession();
        Transaction tx = session.beginTransaction();
        User user = session.get (User.class, id);
        tx.commit();
        session.close();
        if (user != null) System.out.println(user.toString());
        else System.out.println("user=null");
        return user;
    }

    public List<User> getUsers () {
        Session session = HibernateSessionGet.GetSessionFactory().openSession();
        Transaction tx= session.beginTransaction();
        System.out.println("FROM " + User.class.getSimpleName());
        List<User> results = session.createQuery("FROM " + User.class.getSimpleName()).list();
        tx.commit();
        session.close();
        if (results.size() >0 ) return results;
        else return null;
    }
}
