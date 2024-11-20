package com.example.santander.controller;


import com.example.santander.service.RandomUserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import com.example.santander.dto.response.RandomUserResponse.Result;
import java.util.List;

@RestController
@RequestMapping("/api")
public class RandomUserController {

    @Autowired
    private RandomUserService randomUserService;

    @GetMapping("/amigos")
    public ResponseEntity<List<Result>> obtenerAmigos() {
        List<Result> amigos = randomUserService.obtenerAmigos();
        return ResponseEntity.ok(amigos);
    }
}