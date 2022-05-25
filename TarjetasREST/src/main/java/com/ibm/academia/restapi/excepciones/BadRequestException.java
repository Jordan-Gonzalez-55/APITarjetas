package com.ibm.academia.restapi.excepciones;

public class BadRequestException extends RuntimeException{

    public BadRequestException(String message) {
        super(message);
    }

    private static final long serialVersionUID = -2709714543046012095L;
}
