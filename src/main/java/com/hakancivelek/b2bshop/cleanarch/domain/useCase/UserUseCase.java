package com.hakancivelek.b2bshop.cleanarch.domain.useCase;

import com.hakancivelek.b2bshop.cleanarch.domain.model.user.Password;
import com.hakancivelek.b2bshop.cleanarch.domain.model.user.User;

public interface UserUseCase {
    boolean login(User user, Password password);
    boolean logout(User user);
}
