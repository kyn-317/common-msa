package com.kyn.common.exception;

public class AlreadyCreatedCartException extends RuntimeException {
    public AlreadyCreatedCartException(String message) {
        super(message);
    }
}
