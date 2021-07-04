package com.mpp.mysqlSpringBoot.person;


import org.springframework.stereotype.Component;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Component
@Entity(name="persons")
public class Person {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private int id;

    private String pName;
    private String pEmail;

    public Person(int id, String pName, String pEmail) {
        this.id = id;
        this.pName = pName;
        this.pEmail = pEmail;
    }

    public Person(String pName, String pEmail) {
        this.pName = pName;
        this.pEmail = pEmail;
    }

    public Person() {
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getpName() {
        return pName;
    }

    public void setpName(String pName) {
        this.pName = pName;
    }

    public String getpEmail() {
        return pEmail;
    }

    public void setpEmail(String pEmail) {
        this.pEmail = pEmail;
    }
}
