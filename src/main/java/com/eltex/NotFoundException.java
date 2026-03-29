package com.eltex;

public class NotFoundException extends RuntimeException {
    public NotFoundException(long id) {
        super("User with id " + id + " not found");
    }
}
