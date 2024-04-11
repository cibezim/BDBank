package com.bdbank.BDBank.controller.entity;

import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class Transaction {
    @Id
    private int transNumber;
    private String mainAcc;
    private String action;
    private String seller;

    public Transaction() {

    }

    public Transaction(int transNumber, String mainAcc, String action, String seller) {
        this.transNumber = transNumber;
        this.mainAcc = mainAcc;
        this.action = action;
        this.seller = seller;
    }

    public int getTransNumber() {
        return transNumber;
    }

    public void setTransNumber(int transNumber) {
        this.transNumber = transNumber;
    }

    public String getMainAcc() {
        return mainAcc;
    }

    public void setMainAcc(String mainAcc) {
        this.mainAcc = mainAcc;
    }

    public String getAction() {
        return action;
    }

    public void setAction(String action) {
        this.action = action;
    }

    public String getSeller() {
        return seller;
    }

    public void setSeller(String seller) {
        this.seller = seller;
    }
}