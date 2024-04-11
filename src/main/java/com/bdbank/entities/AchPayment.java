package com.bdbank.entities;

import javax.persistence.Entity;

@Entity
public class AchPayment {
    private String name;
    private String password;
    private String account;

    // Constructors, getters, and setters
    public AchPayment() {
        // Default constructor for JPA
    }

    public AchPayment(String name, String password, String account) {
        this.name = name;
        this.password = password;
        this.account = account;
    }

    // Getters and setters...

    public String getName() {
        return name;
    }
}