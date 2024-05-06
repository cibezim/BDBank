package com.bdbank.exceptions;

/**
 * Custom exception class for handling issues related to AchPayment operations.
 */
public class AchPaymentException extends RuntimeException {

    /**
     * Default constructor for AchPaymentException.
     */
    public AchPaymentException() {
        super("An error occurred with AchPayment operations.");
    }

    /**
     * Constructor for AchPaymentException with a custom error message.
     *
     * @param message The custom error message.
     */
    public AchPaymentException(String message) {
        super(message);
    }

    /**
     * Constructor for AchPaymentException with a custom error message and cause.
     *
     * @param message The custom error message.
     * @param cause   The cause of the exception.
     */
    public AchPaymentException(String message, Throwable cause) {
        super(message, cause);
    }

    /**
     * Constructor for AchPaymentException with a cause.
     *
     * @param cause The cause of the exception.
     */
    public AchPaymentException(Throwable cause) {
        super("An error occurred with AchPayment operations.", cause);
    }
}
