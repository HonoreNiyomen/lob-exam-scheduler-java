package com.lob_exams.exceptions;

public class UserNotFoundException extends RuntimeException {
    public UserNotFoundException(String key, String value) {
        super("User not found with " + key + ": " + value);
    }
}