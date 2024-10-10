package com.hakancivelek.b2bshop.cleanarch.domain.model.common;

import com.hakancivelek.b2bshop.cleanarch.domain.model.user.User;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;

import java.util.Date;

public abstract class AbstractEntity {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
//    Date dateCreated;
//    User createdBy;
//    Date lastUpdated;
//    User updatedBy;

//    public AbstractEntity(Date dateCreated, User createdBy, Date lastUpdated, User updatedBy) {
//        this.dateCreated = dateCreated;
//        this.createdBy = createdBy;
//        this.lastUpdated = lastUpdated;
//        this.updatedBy = updatedBy;
//    }
}
