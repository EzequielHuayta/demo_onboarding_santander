package com.example.santander.service;
import com.example.santander.dto.response.RandomUserResponse.Result;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;
@RestController
@RequestMapping("/api")
public interface RandomUserService {

    public List<Result> obtenerAmigos();

}
