package com.bdbank.controllers;

@RestController
@RequestMapping("/transactions")
public class TransactionController {

    private final TransactionRepository transactionRepository;

    public TransactionController(TransactionRepository transactionRepository) {
        this.transactionRepository = transactionRepository;
    }
    /**
     * Retrieves all transactions from the transaction repository.
     *
     * @return a list of Transaction objects representing all transactions.
     */    
    @GetMapping
    public List<Transaction> getAllTransactions() {
        return transactionRepository.findAll();
    }
    /**
     * Retrieves a transaction by ID.
     *
     * @param  id   The ID of the transaction to retrieve.
     * @return      The Transaction object representing the transaction with the specified ID, or null if not found.
     */    
    @GetMapping("/{id}")
    public Transaction getTransactionById(@PathVariable Long id) {
        return transactionRepository.findById(id).orElse(null);
    }
    /**
     * Creates a new transaction by saving the provided transaction object in the transaction repository.
     *
     * @param  transaction  the transaction object to be saved
     * @return              the saved transaction object
     */
    @PostMapping
    public Transaction createTransaction(@RequestBody Transaction transaction) {
        return transactionRepository.save(transaction);
    }
    /**
     * Deletes a transaction by its ID.
     *
     * @param  id  the ID of the transaction to be deleted
     */
    @DeleteMapping("/{id}")
    public void deleteTransaction(@PathVariable Long id) {
        transactionRepository.deleteById(id);
    }

}
