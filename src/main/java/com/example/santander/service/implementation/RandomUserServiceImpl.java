package com.example.santander.service.implementation;

import com.example.santander.dto.response.RandomUserResponse;
import com.example.santander.dto.response.RandomUserResponse.Result;
import com.example.santander.repository.RandomUserRepository;
import com.example.santander.service.RandomUserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

import java.util.List;


@Service
public class RandomUserServiceImpl implements RandomUserService {


    @Autowired
    private RandomUserRepository randomUserRepository;

    @Override
    public List<Result> obtenerAmigos() {
        String url = "https://randomuser.me/api/?results=2&inc=name,email&nat=es";
        RandomUserResponse response = randomUserRepository.fetchRandomUsers(url);
        return response.getResults();
    }
}
