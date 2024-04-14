package com.example.httpclient.service;

import com.example.httpclient.config.JsonPlaceHolderHttpClient;
import com.example.httpclient.model.User;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class UserService {

    private final JsonPlaceHolderHttpClient client;

    public UserService(JsonPlaceHolderHttpClient client) {
        this.client = client;
    }

    public List<User> getAllUsers() {
        return client.findAllUsers();
    }

    public User getUserById(Integer id) {
        return client.findUserById(id);
    }

    public User createUser(User user) {
        return client.createUser(user);
    }

    public void deleteUserById(Integer id) {
        client.deleteUser(id);
    }
}
