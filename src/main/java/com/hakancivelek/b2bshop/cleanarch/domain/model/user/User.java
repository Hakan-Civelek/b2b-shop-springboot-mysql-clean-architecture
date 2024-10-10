package com.hakancivelek.b2bshop.cleanarch.domain.model.user;

import com.hakancivelek.b2bshop.cleanarch.domain.model.user.exception.UserAlreadyLoggedException;
import com.hakancivelek.b2bshop.cleanarch.domain.model.user.exception.UserLockedException;
import com.hakancivelek.b2bshop.cleanarch.domain.model.common.AbstractEntity;
import jakarta.persistence.Column;

public class User extends AbstractEntity {
    private String name;
    @Column(unique = true)
    private String username;
    private String password;
    @Column(unique = true)
    private String email;
    private String phoneNumber;
    private int loginFailureCount;
    private boolean locked;
    private boolean logged;

    public User(/*Date dateCreated, User createdBy, Date lastUpdated, User updatedBy,*/
                String name, String username,
                String password, String email, String phoneNumber) {
//        super(dateCreated, createdBy, lastUpdated, updatedBy);
        this.name = name;
        this.username = username;
        this.password = password;
        this.email = email;
        this.phoneNumber = phoneNumber;
    }

    public void login() throws UserLockedException, UserAlreadyLoggedException {
        if (locked)
            throw new UserLockedException();

        if (logged)
            throw new UserAlreadyLoggedException();

        logged = true;
    }

    public int loginFailureCount() {
        return loginFailureCount;
    }
    public int increaseLoginFailureCount() {
        return ++loginFailureCount;
    }
    public void logout() {
        logged = false;
    }

    public void lock() {
        locked = true;
    }
}
