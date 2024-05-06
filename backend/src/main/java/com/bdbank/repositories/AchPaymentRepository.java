package com.bdbank.repositories;


import com.bdbank.entities.AchPayment;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.Date;
import java.util.List;

@Repository
public interface AchPaymentRepository extends JpaRepository<AchPayment, Long> {

    /**
     * Find all AchPayment entities with a specific status
     * @param status The status to search for
     * @return A list of AchPayment entities with the specified status
     */
    List<AchPayment> findByStatus(String status);

    /**
     * Find all AchPayment entities with a specific client ID
     * @param clientId The client ID to search for
     * @return A list of AchPayment entities with the specified client ID
     */
    List<AchPayment> findByClientId(Long clientId);

    /**
     * Find all AchPayment entities with a specific payment date
     * @param startDate and endDate The payment date to search for
     * @return A list of AchPayment entities with the specified payment date
     */
    List<AchPayment> findByPaymentDateBetween(Date startDate, Date endDate);


   /**
     * Find all AchPayment entities with a specific amount
    * @param amount The amount to search for
    * @return A list of AchPayment entities with the specified amount
     */
    List<AchPayment> findByAmount(Double amount);

    /**
     * Find all AchPayment entities with a specific client ID and status
     * @param clientId The client ID to search for
     * @param status The status to search for
     * @return A list of AchPayment entities with the specified client ID and status
     */
    List<AchPayment> findByClientIdAndStatus(Long clientId, String status);

    /**
     * Find all AchPayment entities with a specific account number
     * @param accountNumber The account number to search for
     * @return A list of AchPayment entities with the specified account number
     */
    List<AchPayment> findByAccountNumber(String accountNumber);

    /**
     * Find all AchPayment entities with a specific routing number
     * @param routingNumber The routing number to search for
     * @return A list of AchPayment entities with the specified routing number
     */
    List<AchPayment> findByRoutingNumber(String routingNumber);

    /**
     * Find all AchPayment entities with a specific transaction type
     * @param transactionType The transaction type to search for
     * @return A list of AchPayment entities with the specified transaction type
     */
    List<AchPayment> findByTransactionType(String transactionType);
}
