package com.bdbank.repositories;


@Repository
class TransactionRepository {
    /**
     * Finds all Transaction objects with the given action.
     *
     * @param  action  the action to search for
     * @return         a list of Transaction objects with the given action
     */
    List<Transaction> findByMainAcc(long accNum) extends JpaRepository<Transaction, Long>;

    /**
     * Finds all Transaction objects with the given account number and action.
     *
     * @param  mainAcc  the account number to search for
     * @param  action   the action to search for
     * @return          a list of Transaction objects with the given account number and action
     */    
    List<Transaction> findByAccNumAndSeller(long accNum, String seller) extends JpaRepository<Transaction, Long>;

    /**
     * Finds all Transaction objects with the given account number, action, and seller.
     *
     * @param  accNum  the account number to search for
     * @param  action  the action to search for
     * @return         a list of Transaction objects with the given account number, action, and seller
     */
    List<Transaction> findByAccNumAndAction(long accNum, String action) extends JpaRepository<Transaction, Long>;
    /**
     * Finds all Transaction objects with the given account number, action, and seller.
     *
     * @param  accNum  the account number to search for
     * @param  action  the action to search for
     * @param  seller  the seller to search for
     * @return         a list of Transaction objects with the given account number, action, and seller
     */
    List<Transaction> findByAccNumAndActionAndSeller(long accNum, String action, String seller) extends JpaRepository<Transaction, Long>;

    /**
     * Finds all Transaction objects with the given account number, action, seller, and transaction number.
     *
     * @param  accNum     the account number to search for
     * @param  action     the action to search for
     * @param  seller    the seller to search for
     * @param  transNumber    the transaction number to search for
     * @return            a list of Transaction objects with the given account number, action, seller, and transaction number
     */    
    List<Transaction> findByMainAccAndActionAndSellerAndTransNumber(long accNum, String action, String seller, long transNumber) extends JpaRepository<Transaction, Long>;

}