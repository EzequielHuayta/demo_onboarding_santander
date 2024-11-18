package com.example.santander.exceptions;


import com.example.santander.dto.response.ErrorResponse;
import lombok.extern.slf4j.Slf4j;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.*;

@ControllerAdvice
@Slf4j
public class GlobalExceptionHandler {


    @ExceptionHandler(Exception.class)
    public @ResponseBody ErrorResponse handleException(Exception e) {
        log.error("Error de servidor: " + e.getMessage());

        return new ErrorResponse(HttpStatus.INTERNAL_SERVER_ERROR.value(), e.getMessage());
    }

    @ExceptionHandler(UsuarioNotFoundException.class)
    @ResponseStatus(HttpStatus.NOT_FOUND)
    public @ResponseBody ErrorResponse handleUsuarioNotFoundException(UsuarioNotFoundException ex) {
        log.error(ex.getMessage());
        return new ErrorResponse(HttpStatus.NOT_FOUND.value(), ex.getMessage());
    }
}
