package com.hakancivelek.b2bshop.cleanarch.domain.model.user.exception;

public class UserLockedException extends Exception {
    private static final String messageString = "User is already locked.";
    public UserLockedException(){
        super(messageString);
    }
}