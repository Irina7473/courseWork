package org.example.Controllers;

import org.example.HibernateSessionGet;
import org.example.Models.Task;
import org.example.Models.Topic;
import org.hibernate.Session;
import org.hibernate.Transaction;

import java.util.List;

public class ControllerTask {
    public  ControllerTask(){}

    public boolean addTask (Task task){
        Session session = HibernateSessionGet.GetSessionFactory().openSession();
        Transaction tx= session.beginTransaction();
        session.persist(task);
        tx.commit();
        session.close();
        return true;
    }

    public Topic getTopicById (int id){
        Session session = HibernateSessionGet.GetSessionFactory().openSession();
        Transaction tx = session.beginTransaction();
        Topic topic =session.get (Topic.class, id);
        tx.commit();
        session.close();
        return topic;
    }

    public List<Task> getTasks () {
        Session session = HibernateSessionGet.GetSessionFactory().openSession();
        Transaction tx= session.beginTransaction();
        List<Task> results = session.createQuery("FROM " + Task.class.getSimpleName()).list();
        tx.commit();
        session.close();
        if (results.size() >0 ) return results;
        else return null;
    }

}
