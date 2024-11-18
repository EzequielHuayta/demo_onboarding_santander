package com.example.santander.repository;

import com.example.santander.dto.response.RandomUserResponse;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;
import org.springframework.web.client.RestTemplate;

@Repository
public class RandomUserRepository {

    @Autowired
    private RestTemplate restTemplate;

    public RandomUserResponse fetchRandomUsers(String url) {
        return restTemplate.getForObject(url, RandomUserResponse.class);
    }
}