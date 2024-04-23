package com.bdbank.dto;

import java.time.LocalDateTime;

class TransactionDTO {

    private Long id;
    private Long accNum;
    private String action;
    private String seller;
    private Double amount;
    private LocalDateTime createdAt;
    private LocalDateTime updatedAt;

    public TransactionDTO(Long id, Long accNum, String action, String seller, Double amount, LocalDateTime createdAt, LocalDateTime updatedAt) {
        this.id = id;
        this.accNum = accNum;
        this.action = action;
        this.seller = seller;
        this.amount = amount;
        this.createdAt = createdAt;
        this.updatedAt = updatedAt;
    }

    /**
     * Get the ID of the transaction.
     *
     * @return          The ID of the transaction.
     */
    public Long getId() {
        return id;
    }

    /**
     * Sets the ID of the transaction.
     *
     * @param  id  the ID to transaction
     */
    public void setId(Long id) {
        this.id = id;
    }

    /**
     * Retrieves the account number associated with this transaction.
     *
     * @return the account number as a Long
     */
    public Long getAccNum() {
        return accNum;
    }

     /**
     * Sets the account number associated with this transaction.
     *
     * @param  accNum  the account number to transaction
     */
    public void setAccNum(Long accNum) {
        this.accNum = accNum;
    }

    /**
     * Retrieves the action associated with this transaction.
     *
     * @return the action as a String
     */
    public String getAction() {
        return action;
    }

    /**
     * Sets the action for this transaction.
     *
     * @param  action  the action to transaction
     */
    public void setAction(String action) {
        this.action = action;
    }

    /**
     * Retrieves the seller associated with this transaction.
     *
     * @return the seller as a String
     */
    public String getSeller() {
        return seller;
    }

    /**
     * Sets the seller for this transaction.
     *
     * @param  seller  the seller to set for this transaction
     */
    public void setSeller(String seller) {
        this.seller = seller;
    }

    /**
     * Retrieves the amount of this transaction.
     *
     * @return the amount of this transaction
     */
    public Double getAmount() {
        return amount;
    }
    
    /**
     * Sets the amount of the transaction.
     *
     * @param  amount  the amount to set for the transaction
     */    
    public void setAmount(Double amount) {
        this.amount = amount;
    }

    /**
     * Retrieves the creation date of the transaction.
     *
     * @return          The creation date of the transaction.
     */
    public LocalDateTime getCreatedAt() {
        return createdAt;
    }
    
    /**
     * Sets the creation date of the object.
     *
     * @param  createdAt  the creation date to set
     */    
    public void setCreatedAt(LocalDateTime createdAt) {
        this.createdAt = createdAt;
    }
    /**
     * Retrieves the updatedAt value from the object.
     *
     * @return          The updatedAt value.
     */
    public LocalDateTime getUpdatedAt() {
        return updatedAt;
    }

    /**
     * Sets the updated date of the object.
     *
     * @param  updatedAt  the updated date to set
     */
    public void setUpdatedAt(LocalDateTime updatedAt) {
        this.updatedAt = updatedAt;
    }
}