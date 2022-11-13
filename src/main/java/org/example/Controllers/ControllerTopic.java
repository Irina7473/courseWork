package org.example.Controllers;

import org.example.HibernateSessionGet;
import org.example.Models.Topic;
import org.hibernate.Session;
import org.hibernate.Transaction;

import java.util.List;

public class ControllerTopic {
    public ControllerTopic(){}

    public boolean addTopic (Topic topic ){
        Session session = HibernateSessionGet.GetSessionFactory().openSession();
        Transaction tx= session.beginTransaction();
        session.persist(topic);
        tx.commit();
        session.close();
        return true;
    }

    public boolean addTopic (String name ){
        Session session = HibernateSessionGet.GetSessionFactory().openSession();
        Transaction tx= session.beginTransaction();
        session.persist(new Topic(name));
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

    public boolean removeTopicById (int id){
        Session session = HibernateSessionGet.GetSessionFactory().openSession();
        Transaction tx= session.beginTransaction();
        boolean test=false;
        Topic topic= session.get(Topic.class, id);
        if (topic != null) {
            session.remove(topic);
            test = true;
        }
        tx.commit();
        session.close();
        return test;
    }

    public boolean updateNameTopicById (int id, String name) {
        Session session = HibernateSessionGet.GetSessionFactory().openSession();
        Transaction tx = session.beginTransaction();
        Topic topic =session.get (Topic.class, id);
        if (!name.isEmpty() || name!=null) topic.SetName(name);
        tx.commit();
        session.close();
        return true;
    }

    public List<Topic> getTopics () {
        Session session = HibernateSessionGet.GetSessionFactory().openSession();
        Transaction tx= session.beginTransaction();
        List<Topic> results = session.createQuery("FROM " + Topic.class.getSimpleName()).list();
        tx.commit();
        session.close();
        if (results.size() >0 ) return results;
        else return null;
    }

    public List<Topic> getTopicByTopicName (String name) {
        Session session = HibernateSessionGet.GetSessionFactory().openSession();
        Transaction tx= session.beginTransaction();
        List<Topic> results = session.createQuery("FROM " + Topic.class.getSimpleName() + " WHERE topicName='" + name + "'").list();
        tx.commit();
        session.close();
        if (results.size() >0 ) return results;
        else return null;
    }
}
