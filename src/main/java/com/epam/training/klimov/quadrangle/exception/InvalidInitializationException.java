package com.epam.training.klimov.quadrangle.exception;


public class InvalidInitializationException extends Exception {
    public InvalidInitializationException() {
    }

    public InvalidInitializationException(String message) {
        super(message);
    }

    public InvalidInitializationException(String message, Throwable cause) {
        super(message, cause);
    }

    public InvalidInitializationException(Throwable cause) {
        super(cause);
    }
}
