package com.bdbank.controllers;

import com.bdbank.entities.AchPayment;
import com.bdbank.repositories.AchPaymentRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

/**
 * The controller for the AchPayment entity
 */
@RestController
@RequestMapping("/ach-payments")
public class AchPaymentController {

    /**
     * The repository for the AchPayment entity
     */
    private final AchPaymentRepository achPaymentRepository;

    /**
     * The constructor for the AchPaymentController
     * @param achPaymentRepository The repository for the AchPayment entity
     */
    @Autowired
    public AchPaymentController(AchPaymentRepository achPaymentRepository) {
        this.achPaymentRepository = achPaymentRepository;
    }

    /**
     * Get all payments
     * @return A list of all payments
     */
    @GetMapping
    public List<AchPayment> getAllPayments() {
        return achPaymentRepository.findAll();
    }

    /**
     * Get a payment by ID
     * @param id The ID of the payment to get
     * @return The payment with the specified ID
     */
    @GetMapping("/{id}")
    public ResponseEntity<AchPayment> getPaymentById(@PathVariable Long id) {
        Optional<AchPayment> payment = achPaymentRepository.findById(id);
        if (payment.isPresent()) {
            return ResponseEntity.ok(payment.get());
        } else {
            return ResponseEntity.status(HttpStatus.NOT_FOUND).body(null);
        }
    }

    /**
     * Create a payment
     * @param payment The payment to create
     * @return The created payment
     */
    @PostMapping
    public AchPayment createPayment(@RequestBody AchPayment payment) {
        return achPaymentRepository.save(payment);
    }

    /**
     * Update a payment
     * @param id The ID of the payment to update
     * @param paymentDetails The updated payment details
     * @return The updated payment
     */
    @PutMapping("/{id}")
    public ResponseEntity<AchPayment> updatePayment(@PathVariable Long id, @RequestBody AchPayment paymentDetails) {
        Optional<AchPayment> payment = achPaymentRepository.findById(id);
        if (payment.isPresent()) {
            AchPayment existingPayment = payment.get();
            existingPayment.setClientId(paymentDetails.getClientId());
            existingPayment.setAmount(paymentDetails.getAmount());
            existingPayment.setAccountNumber(paymentDetails.getAccountNumber());
            existingPayment.setRoutingNumber(paymentDetails.getRoutingNumber());
            existingPayment.setPaymentType(paymentDetails.getPaymentType());
            existingPayment.setStatus(paymentDetails.getStatus());
            existingPayment.setUpdatedAt(paymentDetails.getUpdatedAt());

            AchPayment updatedPayment = achPaymentRepository.save(existingPayment);
            return ResponseEntity.ok(updatedPayment);
        } else {
            return ResponseEntity.status(HttpStatus.NOT_FOUND).body(null);
        }
    }

    /**
     * Delete a payment
     * @param id The ID of the payment to delete
     * @return A response entity with no content
     */
    @DeleteMapping("/{id}")
    public ResponseEntity<Void> deletePayment(@PathVariable Long id) {
        if (achPaymentRepository.existsById(id)) {
            achPaymentRepository.deleteById(id);
            return ResponseEntity.noContent().build();
        } else {
            return ResponseEntity.status(HttpStatus.NOT_FOUND).build();
        }
    }
}
