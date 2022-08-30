package com.sajenko.producerexample.restservice;

import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public class UserRepository {

    public User getUserById(Long id) {
        return new User(id, "Adam");
    }

    public List<User> getAllUsers() {
        return List.of(new User(1L, "Adam"), new User(2L, "Tomek"));
    }
}
