package org.predictor.picoplaca.exception;

/**
 * Custom class for exception handling in validators
 *
 * @author martin
 */
public class ValidationException extends Exception {
    public ValidationException(String message) {
        super(message);
    }
}
