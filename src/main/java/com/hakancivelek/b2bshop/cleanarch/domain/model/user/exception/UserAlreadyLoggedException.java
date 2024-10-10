package com.hakancivelek.b2bshop.cleanarch.domain.model.user.exception;

public class UserAlreadyLoggedException extends Exception {
    private static final String messageString = "User is already logged in the system";
    public UserAlreadyLoggedException(){
        super(messageString);
    }
}

