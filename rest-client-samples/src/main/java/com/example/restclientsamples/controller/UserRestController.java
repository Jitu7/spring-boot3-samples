package com.example.restclientsamples.controller;

import com.example.restclientsamples.model.User;
import com.example.restclientsamples.proxy.JsonPlaceHolderApiProxy;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/users")
public class UserRestController {

    private final JsonPlaceHolderApiProxy proxy;

    public UserRestController(JsonPlaceHolderApiProxy proxy) {
        this.proxy = proxy;
    }

    @GetMapping
    public List<User> getAllUser() {
        return proxy.getUsers();
    }
}
