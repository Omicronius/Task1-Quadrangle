package com.epam.training.klimov.quadrangle.exception;

public class IncorrectPointsDataException extends Exception {
    public IncorrectPointsDataException() {
    }

    public IncorrectPointsDataException(String message) {
        super(message);
    }

    public IncorrectPointsDataException(String message, Throwable cause) {
        super(message, cause);
    }

    public IncorrectPointsDataException(Throwable cause) {
        super(cause);
    }
}
