package com.personal.gwent.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.personal.gwent.model.user.User;
import com.personal.gwent.repository.user.UserRepository;

@Service
public class UserServiceImpl implements UserService {

    @Autowired
    UserRepository repo;

    @Override
    public User SaveUser(User user) {
        return repo.save(user);
    }

    
    
}
