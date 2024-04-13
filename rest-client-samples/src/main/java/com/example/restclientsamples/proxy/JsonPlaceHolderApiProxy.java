package com.example.restclientsamples.proxy;

import com.example.restclientsamples.model.User;
import org.springframework.core.ParameterizedTypeReference;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestClient;

import java.util.List;

@Service
public class JsonPlaceHolderApiProxy {

    private final RestClient restClient;

    public JsonPlaceHolderApiProxy(RestClient restClient) {
        this.restClient = restClient;
    }

    public List<User> getUsers() {
        return restClient.get()
                .uri("/users")
                .retrieve()
                .body(new ParameterizedTypeReference<>() {
                });
    }
}
