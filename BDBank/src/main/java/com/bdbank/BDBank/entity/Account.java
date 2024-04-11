package com.bdbank.BDBank.controller.entity;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.ManyToMany;
import java.util.Set;


@Entity
public class Account {
    @Id
    private String accNum;

    @ManyToMany
    private Set<User> authUsers;

    private String routingNum;

    //default constructor
    public Account(){

    }

    public Account(String accNum, Set<User> authUsers, String routingNum){
        this.accNum = accNum;
        this.authUsers = authUsers;
        this.routingNum = routingNum;
    }

    public String getAccNum() {
        return accNum;
    }

    public void setAccNum(String accNum) {
        this.accNum = accNum;
    }

    public Set<User> getAuthUsers() {
        return authUsers;
    }

    public void setAuthUsers(Set<User> authUsers) {
        this.authUsers = authUsers;
    }

    public String getRoutingNum() {
        return routingNum;
    }

    public void setRoutingNum(String routingNum) {
        this.routingNum = routingNum;
    }
}