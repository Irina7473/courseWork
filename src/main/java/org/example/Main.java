package org.example;

import org.example.Controllers.ControllerTopic;
import org.example.Controllers.ControllerUser;
import org.example.Controllers.ControllerTask;
import org.example.Models.Task;
import org.example.Models.Topic;
import org.example.Models.User;

import java.util.List;

public class Main {
    public static void main(String[] args) {

       // ControllerTopic ct =new ControllerTopic();

       /* ct.addTopic(new Topic());
        ct.addTopic(new Topic("1"));*/
        //ct.updateNameTopicById(7, "new");

       /* try{
            System.out.println(ct.getTopicById(3).toString());
        }catch (Exception e){
            System.out.println("Не найден элемент");
        }

        List<Topic> results1 = ct.getTopics();
        if (results1.size() > 0 || results1 !=null) {
            for (Topic c : results1) {
                System.out.println(c.toString());
            }
        }
        else System.out.println("Не найден элемент");*/


       /* String name = "дом";
        List<Topic> results2 = ct.getTopicByTopicName(name);
        if (results2.size() > 0 || results2 !=null) {
            for (Topic c : results2) {
                System.out.println(c.toString());
            }
        }
        else System.out.println("Не найден элемент");*/


        ControllerUser cu = new ControllerUser();
        System.out.println(cu.getUserById(2).toString());

        try{
            System.out.println(cu.getUserById(2).toString());
        }catch (Exception e){
            System.out.println("Не найден элемент");
        }

       List<User> results3 = cu.getUsers();
        if (results3.size() > 0 || results3 !=null) {
            for (User c : results3) {
                System.out.println(c.toString());
            }
        }
        else System.out.println("Не найден элемент");

        //ControllerTask cta = new ControllerTask();
        //Task t = new Task("new2", 3, 2, 4, 3);
        //System.out.println(t.toString());
        //cta.addTask(t);


      /*  List<Task> results4 = cta.getTasks();
        if (results4.size() > 0 || results4 !=null) {
            for (Task c : results4) {
                System.out.println(c.toString());
            }
        }*/
    }
}