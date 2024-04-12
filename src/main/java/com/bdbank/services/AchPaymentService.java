package com.bdbank.services;

import com.bdbank.entities.AchPayment;
import com.bdbank.exceptions.AchPaymentException;
import com.bdbank.repositories.AchPaymentRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.time.LocalDateTime;
import java.util.Date;
import java.util.List;
import java.util.Optional;

/**
 * Service class for managing AchPayment operations.
 */
@Service
public class AchPaymentService {

    private final AchPaymentRepository achPaymentRepository;

    /**
     * Constructor for AchPaymentService.
     *
     * @param achPaymentRepository The repository for AchPayment entities.
     */
    @Autowired
    public AchPaymentService(AchPaymentRepository achPaymentRepository) {
        this.achPaymentRepository = achPaymentRepository;
    }

    /**
     * Find an AchPayment by its ID.
     *
     * @param id The ID of the AchPayment.
     * @return The AchPayment entity.
     * @throws AchPaymentException if the AchPayment is not found.
     */
    public AchPayment findPaymentById(Long id) {
        Optional<AchPayment> paymentOptional = achPaymentRepository.findById(id);
        return paymentOptional.orElseThrow(() -> new AchPaymentException("AchPayment with ID " + id + " not found."));
    }

    /**
     * Find all AchPayment entities.
     *
     * @return A list of all AchPayment entities.
     */
    public List<AchPayment> findAllPayments() {
        return achPaymentRepository.findAll();
    }

    /**
     * Create a new AchPayment entity.
     *
     * @param payment The AchPayment entity to create.
     * @return The created AchPayment entity.
     */
    public AchPayment createPayment(AchPayment payment) {
        return achPaymentRepository.save(payment);
    }

    /**
     * Update an existing AchPayment entity.
     *
     * @param id           The ID of the AchPayment to update.
     * @param paymentDetails The updated details for the AchPayment.
     * @return The updated AchPayment entity.
     * @throws AchPaymentException if the AchPayment is not found.
     */
    public AchPayment updatePayment(Long id, AchPayment paymentDetails) {
        AchPayment existingPayment = findPaymentById(id);

        existingPayment.setClientId(paymentDetails.getClientId());
        existingPayment.setAmount(paymentDetails.getAmount());
        existingPayment.setAccountNumber(paymentDetails.getAccountNumber());
        existingPayment.setRoutingNumber(paymentDetails.getRoutingNumber());
        existingPayment.setPaymentType(paymentDetails.getPaymentType());
        existingPayment.setStatus(paymentDetails.getStatus());
        existingPayment.setUpdatedAt(LocalDateTime.now());

        return achPaymentRepository.save(existingPayment);
    }

    /**
     * Delete an AchPayment entity by its ID.
     *
     * @param id The ID of the AchPayment to delete.
     * @throws AchPaymentException if the AchPayment is not found.
     */
    public void deletePayment(Long id) {
        if (!achPaymentRepository.existsById(id)) {
            throw new AchPaymentException("AchPayment with ID " + id + " not found.");
        }
        achPaymentRepository.deleteById(id);
    }

    /**
     * Find AchPayment entities by status.
     *
     * @param status The status to search for.
     * @return A list of AchPayment entities with the specified status.
     */
    public List<AchPayment> findByStatus(String status) {
        return achPaymentRepository.findByStatus(status);
    }

    /**
     * Find AchPayment entities by client ID.
     *
     * @param clientId The client ID to search for.
     * @return A list of AchPayment entities with the specified client ID.
     */
    public List<AchPayment> findByClientId(Long clientId) {
        return achPaymentRepository.findByClientId(clientId);
    }

    /**
     * Find AchPayment entities within a date range.
     *
     * @param startDate The start date of the range.
     * @param endDate   The end date of the range.
     * @return A list of AchPayment entities within the specified date range.
     */
    public List<AchPayment> findByPaymentDateBetween(Date startDate, Date endDate) {
        return achPaymentRepository.findByPaymentDateBetween(startDate, endDate);
    }

    /**
     * Find AchPayment entities by amount.
     *
     * @param amount The amount to search for.
     * @return A list of AchPayment entities with the specified amount.
     */
    public List<AchPayment> findByAmount(Double amount) {
        return achPaymentRepository.findByAmount(amount);
    }

    /**
     * Find AchPayment entities by client ID and status.
     *
     * @param clientId The client ID to search for.
     * @param status   The status to search for.
     * @return A list of AchPayment entities with the specified client ID and status.
     */
    public List<AchPayment> findByClientIdAndStatus(Long clientId, String status) {
        return achPaymentRepository.findByClientIdAndStatus(clientId, status);
    }

    /**
     * Find AchPayment entities by account number.
     *
     * @param accountNumber The account number to search for.
     * @return A list of AchPayment entities with the specified account number.
     */
    public List<AchPayment> findByAccountNumber(String accountNumber) {
        return achPaymentRepository.findByAccountNumber(accountNumber);
    }

    /**
     * Find AchPayment entities by routing number.
     *
     * @param routingNumber The routing number to search for.
     * @return A list of AchPayment entities with the specified routing number.
     */
    public List<AchPayment> findByRoutingNumber(String routingNumber) {
        return achPaymentRepository.findByRoutingNumber(routingNumber);
    }

    /**
     * Find AchPayment entities by transaction type.
     *
     * @param transactionType The transaction type to search for.
     * @return A list of AchPayment entities with the specified transaction type.
     */
    public List<AchPayment> findByTransactionType(String transactionType) {
        return achPaymentRepository.findByTransactionType(transactionType);
    }
}

