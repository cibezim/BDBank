package com.bdbank.dto;

import java.time.LocalDateTime;

/**
 * Data Transfer Object for AchPayment entity.
 */
public class AchPaymentDTO {

    /**
     * The ID of the payment.
     */
    private Long id;

    /**
     * The client ID of the payment.
     */
    private Long clientId;

    /**
     * The amount of the payment.
     */
    private Double amount;

    /**
     * The account number of the payment.
     */
    private String accountNumber;

    /**
     * The routing number of the payment.
     */
    private String routingNumber;

    /**
     * The payment type of the payment.
     */
    private String paymentType;

    /**
     * The status of the payment.
     */
    private String status;

    /**
     * The created date of the payment.
     */
    private LocalDateTime createdAt;

    /**
     * The updated date of the payment.
     */
    private LocalDateTime updatedAt;

    /**
     * Default constructor.
     */
    public AchPaymentDTO() {
    }

    /**
     * Constructor with all fields.
     *
     * @param id             The ID of the payment.
     * @param clientId       The client ID of the payment.
     * @param amount         The amount of the payment.
     * @param accountNumber  The account number of the payment.
     * @param routingNumber  The routing number of the payment.
     * @param paymentType    The payment type of the payment.
     * @param status         The status of the payment.
     * @param createdAt      The created date of the payment.
     * @param updatedAt      The updated date of the payment.
     */
    public AchPaymentDTO(Long id, Long clientId, Double amount, String accountNumber, String routingNumber, String paymentType, String status, LocalDateTime createdAt, LocalDateTime updatedAt) {
        this.id = id;
        this.clientId = clientId;
        this.amount = amount;
        this.accountNumber = accountNumber;
        this.routingNumber = routingNumber;
        this.paymentType = paymentType;
        this.status = status;
        this.createdAt = createdAt;
        this.updatedAt = updatedAt;
    }

    // Getters and setters

    /**
     * Get the ID of the payment.
     *
     * @return The ID of the payment.
     */
    public Long getId() {
        return id;
    }

    /**
     * Set the ID of the payment.
     *
     * @param id The ID of the payment.
     */
    public void setId(Long id) {
        this.id = id;
    }

    /**
     * Get the client ID of the payment.
     *
     * @return The client ID of the payment.
     */
    public Long getClientId() {
        return clientId;
    }

    /**
     * Set the client ID of the payment.
     *
     * @param clientId The client ID of the payment.
     */
    public void setClientId(Long clientId) {
        this.clientId = clientId;
    }

    /**
     * Get the amount of the payment.
     *
     * @return The amount of the payment.
     */
    public Double getAmount() {
        return amount;
    }

    /**
     * Set the amount of the payment.
     *
     * @param amount The amount of the payment.
     */
    public void setAmount(Double amount) {
        this.amount = amount;
    }

    /**
     * Get the account number of the payment.
     *
     * @return The account number of the payment.
     */
    public String getAccountNumber() {
        return accountNumber;
    }

    /**
     * Set the account number of the payment.
     *
     * @param accountNumber The account number of the payment.
     */
    public void setAccountNumber(String accountNumber) {
        this.accountNumber = accountNumber;
    }

    /**
     * Get the routing number of the payment.
     *
     * @return The routing number of the payment.
     */
    public String getRoutingNumber() {
        return routingNumber;
    }

    /**
     * Set the routing number of the payment.
     *
     * @param routingNumber The routing number of the payment.
     */
    public void setRoutingNumber(String routingNumber) {
        this.routingNumber = routingNumber;
    }

    /**
     * Get the payment type of the payment.
     *
     * @return The payment type of the payment.
     */
    public String getPaymentType() {
        return paymentType;
    }

    /**
     * Set the payment type of the payment.
     *
     * @param paymentType The payment type of the payment.
     */
    public void setPaymentType(String paymentType) {
        this.paymentType = paymentType;
    }

    /**
     * Get the status of the payment.
     *
     * @return The status of the payment.
     */
    public String getStatus() {
        return status;
    }

    /**
     * Set the status of the payment.
     *
     * @param status The status of the payment.
     */
    public void setStatus(String status) {
        this.status = status;
    }

    /**
     * Get the created date of the payment.
     *
     * @return The created date of the payment.
     */
    public LocalDateTime getCreatedAt() {
        return createdAt;
    }

    /**
     * Set the created date of the payment.
     *
     * @param createdAt The created date of the payment.
     */
    public void setCreatedAt(LocalDateTime createdAt) {
        this.createdAt = createdAt;
    }

    /**
     * Get the updated date of the payment.
     *
     * @return The updated date of the payment.
     */
    public LocalDateTime getUpdatedAt() {
        return updatedAt;
    }

    /**
     * Set the updated date of the payment.
     *
     * @param updatedAt The updated date of the payment.
     */
    public void setUpdatedAt(LocalDateTime updatedAt) {
        this.updatedAt = updatedAt;
    }
}
