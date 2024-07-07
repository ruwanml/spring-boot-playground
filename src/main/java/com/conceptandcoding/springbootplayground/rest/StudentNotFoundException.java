package com.conceptandcoding.springbootplayground.rest;

public class StudentNotFoundException extends RuntimeException{ // Custom exception class

    // generate constructors from Superclass

    public StudentNotFoundException(String message) {
        super(message);
    }

    public StudentNotFoundException(String message, Throwable cause) {
        super(message, cause);
    }

    public StudentNotFoundException(Throwable cause) {
        super(cause);
    }
}
