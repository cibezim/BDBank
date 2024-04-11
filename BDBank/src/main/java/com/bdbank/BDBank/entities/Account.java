package com.bdbank.BDBank.entities;


public class Account {
    private String name;
    private String password;
    private String account;

    // Constructors, getters, and setters
    public Account() {
        // Default constructor for JPA
    }

    public Account(String name, String password, String account) {
        this.name = name;
        this.password = password;
        this.account = account;
    }

    // Getters and setters...

    public String getName() {
        return name;
    }
}
