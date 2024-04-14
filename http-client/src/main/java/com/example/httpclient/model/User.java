package com.example.httpclient.model;

public record User(Integer id,
                   String name,
                   String username,
                   String email,
                   String phone,
                   String website) {
}
