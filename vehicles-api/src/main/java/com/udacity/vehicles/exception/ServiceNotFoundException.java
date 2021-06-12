package com.udacity.vehicles.exception;

public class ServiceNotFoundException  extends RuntimeException {

    public ServiceNotFoundException() {
    }

    public ServiceNotFoundException(String message) {
        super(message);
    }
}
