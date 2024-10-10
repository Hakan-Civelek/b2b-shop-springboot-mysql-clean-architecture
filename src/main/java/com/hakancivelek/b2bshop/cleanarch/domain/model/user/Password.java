package com.hakancivelek.b2bshop.cleanarch.domain.model.user;

import com.hakancivelek.b2bshop.cleanarch.domain.model.exception.ImproperCredentialException;
import com.hakancivelek.b2bshop.cleanarch.domain.model.util.RandomStringGenerator;

public class Password {
    private final String passwordString;

    private Password(String password) {
        passwordString = password;
    }

    public static Password of(String password) throws ImproperCredentialException {
        validate(password);
        return new Password(password);
    }

    public static Password ofRandom() {
        String passwordString = RandomStringGenerator.generatate(12);
        return new Password(passwordString);
    }

    private static void validate(String passwordString) throws ImproperCredentialException {
        if (passwordString.length() < 8 || passwordString.length() > 16)
            throw new ImproperCredentialException("Password length must be between 8 and 16 characters");
    }
}
