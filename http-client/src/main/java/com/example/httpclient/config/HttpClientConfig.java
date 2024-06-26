package com.example.httpclient.config;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.client.RestClient;
import org.springframework.web.client.support.RestClientAdapter;
import org.springframework.web.service.invoker.HttpServiceProxyFactory;

@Configuration
public class HttpClientConfig {

    @Bean
    JsonPlaceHolderHttpClient jsonPlaceHolderService(
            @Value("${placeholder_api_base_uri}") String baseURI) {
        RestClient restClient = RestClient.create(baseURI);
        HttpServiceProxyFactory factory = HttpServiceProxyFactory.builderFor(
                        RestClientAdapter.create(restClient))
                .build();

        return factory.createClient(JsonPlaceHolderHttpClient.class);
    }
}
