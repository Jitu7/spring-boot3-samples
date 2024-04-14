package com.example.restclientsamples.proxy;

import com.example.restclientsamples.model.User;
import org.springframework.core.ParameterizedTypeReference;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestClient;

import java.util.List;

import static org.springframework.http.MediaType.APPLICATION_JSON;

@Service
public class JsonPlaceHolderApiProxy {

    private final RestClient restClient;

    public JsonPlaceHolderApiProxy(RestClient restClient) {
        this.restClient = restClient;
    }

    public List<User> getUsers() {
        return restClient.get()
                .uri("/users")
                .accept(APPLICATION_JSON)
                .retrieve()
                .body(new ParameterizedTypeReference<>() {
                });
    }

    public User getUserById(int id) {
        return restClient.get()
                .uri("/users/{id}", id)
                .accept(APPLICATION_JSON)
                .retrieve()
                .body(User.class);
    }

    public User createUser(User user) {
        return restClient.post()
                .uri("/users")
                .body(user)
                .retrieve()
                .body(User.class);
    }

    public void deleteUserById(Integer id) {
        restClient.delete()
                .uri("/users/{id}", id)
                .retrieve()
                .toBodilessEntity();
    }
}
