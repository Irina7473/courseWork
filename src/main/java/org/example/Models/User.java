package org.example.Models;

import jakarta.persistence.*;

@Entity
@Table(name = "users")
public class User {
    @Id
    @Column(name = "id")
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;
    @Column(name = "userName")
    private String userName;

    @Column(name = "password")
    private String password;

    @Column(name = "idRole")
    private int idRole;

    public User(int id, String userName, String password, int idRole){
        this.id = id;
        this.userName = userName;
        this.password=password;
        this.idRole=idRole;
    }

    public User(String userName, String password){
        this.userName = userName;
        this.password= password;
        this.idRole= 2;
    }

    public User() {  }

    public void SetName(String name){
        this.userName = name;
    }
    public void SetPassword(String pas){
        this.password = pas;
    }
    public void SetIdRole(int num){ this.idRole = num;}

    @Override
    public String toString(){
        return  "userName - " + userName + "/idRole - " + idRole;
    }
}
