package com.example.santander.controller;

import com.example.santander.dto.UsuarioDTO;
import com.example.santander.dto.response.ResponseDTO;
import com.example.santander.service.UsuarioService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import lombok.extern.slf4j.Slf4j;

import java.util.Map;

@RestController
@RequestMapping("/auth")
@Slf4j
public class LoginController {

    @Autowired
    UsuarioService usuarioService;

    @PostMapping(value = "/login", produces = "application/json" )
    public ResponseEntity login(@RequestHeader Map<String, String> headers) {

        String legajo = headers.get("legajo");
        String Contrasenia = headers.get("password");

        UsuarioDTO usuarioDTO = new UsuarioDTO();
        usuarioDTO.setLegajo(legajo);
        usuarioDTO.setContrasenia(Contrasenia);

        log.debug("Llamando al SERVICIO de login - legajo: {}", legajo);

        ResponseDTO<UsuarioDTO> data = new ResponseDTO<>();

        data.setData(usuarioService.autenticarUsuario(usuarioDTO));


        if (data.getData() != null) {
            log.info("legajo: {} logueado con exito", legajo);
            return new ResponseEntity<>(data, HttpStatus.OK);
        } else {
            log.warn("legajo: {} usuario no autenticado", usuarioDTO.getLegajo());

            return new ResponseEntity<>(data, HttpStatus.UNAUTHORIZED);
        }

    }
}
