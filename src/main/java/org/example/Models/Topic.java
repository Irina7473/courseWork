package org.example.Models;

import jakarta.persistence.*;

@Entity
@Table(name = "topics")
public class Topic {
    @Id
    @Column(name = "id")
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;

    @Column(name = "topicName")
    private String topicName;

    public Topic(int id, String topicName){
        this.id = id; this.topicName = topicName;
    }
    public Topic(String topicName){ this.topicName = topicName; }
    public Topic(){
        topicName = "noName";
    }

    public void SetName(String name){
        this.topicName = name;
    }

    @Override
    public String toString(){
        return  "topicName - " + topicName;
    }
}
