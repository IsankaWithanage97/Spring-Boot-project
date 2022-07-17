package com.example.demo.entity;

import javax.persistence.*;

@Entity
@Table(name = "users")
public class User {
    private int id;
    private String name;
    private String address;

    public User() {
    }

    public User(int id, String name, String address) {
        this.id = id;
        this.name = name;
        this.address = address;
    }
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getFirstName() {
        return name;
    }

    public void setFirstName(String firstName) {
        this.name = name;
    }

    public String getLastName() {
        return address;
    }

    public void setLastName(String lastName) {
        this.address = address;
    }
}