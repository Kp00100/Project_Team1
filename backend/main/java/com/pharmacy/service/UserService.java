package com.pharmacy.service;

import com.pharmacy.entity.User;
import com.pharmacy.repository.UserRepository;
import org.springframework.stereotype.Service;

@Service
public class UserService {
    private final UserRepository repo;

    public UserService(UserRepository repo) {
        this.repo = repo;
    }

    public User findByUsername(String username) {
        return repo.findByUsername(username);
    }

    public User saveUser(User user) {
        return repo.save(user);
    }
}