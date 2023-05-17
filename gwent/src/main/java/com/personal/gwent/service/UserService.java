package com.personal.gwent.service;

import java.util.Optional;

import com.personal.gwent.model.user.User;

public interface UserService {
    public User saveUser(User user);
    public Optional<User> findByUsername(String username);
}
