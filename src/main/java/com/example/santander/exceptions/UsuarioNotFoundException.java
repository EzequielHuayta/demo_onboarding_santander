package com.example.santander.exceptions;

public class UsuarioNotFoundException extends RuntimeException{

    public UsuarioNotFoundException(String message) {
        super(message);
    }

}
