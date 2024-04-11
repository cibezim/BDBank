package com.bdbank.BDBank.controller.entity;

import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class AchPayment {
    @Id
    private String cardCompany;
    private int transaction;
    private String typeOfTransaction;
    private String account;

    public AchPayment(){

    }

    public AchPayment (String cardCompany, int transaction, String typeOfTransaction, String account){
        this.cardCompany = cardCompany;
        this.transaction = transaction;
        this.typeOfTransaction = typeOfTransaction;
        this.account = account;
    }

    public String getCardCompany() {
        return cardCompany;
    }

    public void setCardCompany(String cardCompany) {
        this.cardCompany = cardCompany;
    }

    public int getTransaction() {
        return transaction;
    }

    public void setTransaction(int transaction) {
        this.transaction = transaction;
    }

    public String getTypeOfTransaction() {
        return typeOfTransaction;
    }

    public void setTypeOfTransaction(String typeOfTransaction) {
        this.typeOfTransaction = typeOfTransaction;
    }

    public String getAccount() {
        return account;
    }

    public void setAccount(String account) {
        this.account = account;
    }
}