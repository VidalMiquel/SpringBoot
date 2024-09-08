package com.example.demo.service;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

import org.springframework.stereotype.Service;

import com.example.demo.model.User;

@Service
public class UserService {

    private List<User> users = new ArrayList<>();

    public UserService() {
        // Add some dummy users for testing
        users.add(new User(1L, "John Doe", "john@example.com"));
        users.add(new User(2L, "Jane Doe", "jane@example.com"));
    }

    // Get all users
    public List<User> getAllUsers() {
        return users;
    }

    // Get a specific user by ID
    public Optional<User> getUserById(Long id) {
        return users.stream().filter(user -> user.getId().equals(id)).findFirst();
    }

    // Add a new user
    public void addUser(User user) {
        users.add(user);
    }
}
