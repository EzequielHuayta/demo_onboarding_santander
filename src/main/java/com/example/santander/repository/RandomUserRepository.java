package com.example.santander.repository;

import com.example.santander.dto.response.RandomUserResponse;
import org.springframework.stereotype.Repository;
import org.springframework.web.client.RestTemplate;

@Repository
public class RandomUserRepository {

    private final RestTemplate restTemplate;

    public RandomUserRepository(RestTemplate restTemplate) {
        this.restTemplate = restTemplate;
    }

    public RandomUserResponse fetchRandomUsers(String url) {
        return restTemplate.getForObject(url, RandomUserResponse.class);
    }
}