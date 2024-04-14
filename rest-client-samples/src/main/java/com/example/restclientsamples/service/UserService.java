package com.example.restclientsamples.service;

import com.example.restclientsamples.model.User;
import com.example.restclientsamples.proxy.JsonPlaceHolderApiProxy;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class UserService {

    private final JsonPlaceHolderApiProxy proxy;

    public UserService(JsonPlaceHolderApiProxy proxy) {
        this.proxy = proxy;
    }

    public List<User> getAllUsers() {
        return proxy.getUsers();
    }

    public User getUserById(Integer id) {
        return proxy.getUserById(id);
    }

    public User createUser(User user) {
        return proxy.createUser(user);
    }

    public void deleteUserById(Integer id) {
        proxy.deleteUserById(id);
    }
}
