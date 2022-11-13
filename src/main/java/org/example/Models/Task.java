package org.example.Models;

import jakarta.persistence.*;
import  java.util.Date;

@Entity
@Table(name = "tasks")
public class Task {
    @Id
    @Column(name = "id")
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;
    @Column(name = "taskName")
    private String taskName;
    @Column(name = "description")
    private String description;
    @Column(name = "deadline")
    private Date deadline;
    @Column(name = "idTopic")
    private int idTopic;
    @Column(name = "idImportance")
    private int idImportance;
    @Column(name = "idTaskManager")
    private int idTaskManager;
    @Column(name = "idTaskExecutor")
    private int idTaskExecutor;

    public Task(){}
    public Task(int id, String taskName, String description, Date deadline, int idTopic, int idImportance, int idTaskManager, int idTaskExecutor){
        this.id=id;
        this.taskName=taskName;
        this.description=description;
        this.deadline=deadline;
        this.idImportance=idImportance;
        this.idTopic=idTopic;
        this.idTaskManager=idTaskManager;
        this.idTaskExecutor=idTaskExecutor;
    }

    public Task(String taskName, int idTopic, int idImportance, int idTaskManager, int idTaskExecutor){
        this.taskName=taskName;
        //this.description="";
        //this.deadline= new Date();
        this.idImportance=idImportance;
        this.idTopic=idTopic;
        this.idTaskManager=idTaskManager;
        this.idTaskExecutor=idTaskExecutor;
    }

    @Override
    public String toString(){
        return  "taskName - " + taskName + " idImportance - " + idImportance + " idTopic - " + idTopic;
    }

}
