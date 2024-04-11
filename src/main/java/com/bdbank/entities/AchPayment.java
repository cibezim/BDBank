package com.bdbank.entities;

import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.NotNull;

import javax.persistence.*;
import java.time.LocalDateTime;

@Entity
@Table(name = "ach_payments")
public class AchPayment {

    /**
     * The id of the payment
     */
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    /**
     * The client id of the payment
     */
    @NotNull
    @Column(name = "client_id")
    private Long clientId;

    /**
     * The amount of the payment
     */
    @NotNull
    @Column(name = "amount")
    private Double amount;

    /**
     * The account number of the payment
     */
    @NotNull
    @Column(name = "account_number")
    private String accountNumber;

    /**
     * The routing number of the payment
     */
    @NotNull
    @Column(name = "routing_number")
    private String routingNumber;

    /**
     * The payment type of the payment
     */
    @NotBlank
    @Column(name = "payment_type")
    private String paymentType;

    /**
     * The status of the payment
     */
    @NotBlank
    @Column(name = "status")
    private String status;

    /**
     * The created at date of the payment
     */
    @Column(name = "created_at")
    private LocalDateTime createdAt;

    /**
     * The updated at date of the payment
     */
    @Column(name = "updated_at")
    private LocalDateTime updatedAt;

    /**
     * Default constructor
     */
    public AchPayment() {}

    /**
     * get the id of the payment
     * @return the id of the payment
     */
    public Long getId() {
        return id;
    }

    /**
     * set the id of the payment
     * @param id the id of the payment
     */
    public void setId(Long id) {
        this.id = id;
    }

    /**
     * get the client id of the payment
     * @return the client id of the payment
     */
    public Long getClientId() {
        return clientId;
    }

    /**
     * set the client id of the payment
     * @param clientId the client id of the payment
     */
    public void setClientId(Long clientId) {
        this.clientId = clientId;
    }

    /**
     * get the amount of the payment
     * @return the amount of the payment
     */
    public Double getAmount() {
        return amount;
    }

    /**
     * set the amount of the payment
     * @param amount the amount of the payment
     */
    public void setAmount(Double amount) {
        this.amount = amount;
    }

    /**
     * get the account number of the payment
     * @return the account number of the payment
     */
    public String getAccountNumber() {
        return accountNumber;
    }

    /**
     * set the account number of the payment
     * @param accountNumber the account number of the payment
     */
    public void setAccountNumber(String accountNumber) {
        this.accountNumber = accountNumber;
    }

    /**
     * get the routing number of the payment
     * @return the routing number of the payment
     */
    public String getRoutingNumber() {
        return routingNumber;
    }

    /**
     * set the routing number of the payment
     * @param routingNumber the routing number of the payment
     */
    public void setRoutingNumber(String routingNumber) {
        this.routingNumber = routingNumber;
    }

    /**
     * get the payment type of the payment
     * @return the payment type of the payment
     */
    public String getPaymentType() {
        return paymentType;
    }

    /**
     * set the payment type of the payment
     * @param paymentType the payment type of the payment
     */
    public void setPaymentType(String paymentType) {
        this.paymentType = paymentType;
    }

    /**
     * get the status of the payment
     * @return the status of the payment
     */
    public String getStatus() {
        return status;
    }

    /**
     * set the status of the payment
     * @param status the status of the payment
     */
    public void setStatus(String status) {
        this.status = status;
    }

    /**
     * get the created at date of the payment
     * @return the created at date of the payment
     */
    public LocalDateTime getCreatedAt() {
        return createdAt;
    }

    /**
     * set the created at date of the payment
     * @param createdAt the created at date of the payment
     */
    public void setCreatedAt(LocalDateTime createdAt) {
        this.createdAt = createdAt;
    }

    /**
     * get the updated at date of the payment
     * @return the updated at date of the payment
     */
    public LocalDateTime getUpdatedAt() {
        return updatedAt;
    }

    /**
     * set the updated at date of the payment
     * @param updatedAt the updated at date of the payment
     */
    public void setUpdatedAt(LocalDateTime updatedAt) {
        this.updatedAt = updatedAt;
    }
}
