package com.ibm.academia.restapi.excepciones;

public class NotFoundException extends RuntimeException {

    public NotFoundException(String message) {
        super(message);
    }

    private static final long serialVersionUID = -7603818100862526774L;
}
