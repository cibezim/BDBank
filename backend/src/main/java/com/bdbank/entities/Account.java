package com.bdbank.entities;

import javax.persistence.Id;
import javax.persistence.Entity;
import java.util.Set;

@Entity
public class Account {
    @Id
   private long accNum;
   private Set<User> authUsers;
   private long routingNum;


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
    public long getAccNum() {
        return accNum;
    }

    public void setAccNum(long accNum) {
        this.accNum = accNum;
    }

    public Set<User> getAuthUsers() {
        return authUsers;
    }

    public void setAuthUsers(Set<User> authUsers) {
        this.authUsers = authUsers;
    }

    public long getRoutingNum() {
        return routingNum;
    }

    public void setRoutingNum(long routingNum) {
        this.routingNum = routingNum;
    }


}
