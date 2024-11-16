package controller;

import dto.ResponseDTO;
import dto.UsuarioDTO;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import repository.UsuarioRepository;
import service.UsuarioService;
import lombok.extern.slf4j.Slf4j;
@RestController
@RequestMapping("/auth")
@Slf4j
public class LoginController {

    @Autowired
    UsuarioService usuarioService;

    @PostMapping(value = "/login", produces = "application/json")
    public ResponseEntity login(@RequestBody UsuarioDTO usuarioDTO) {
        ResponseDTO data = new ResponseDTO();
        return new ResponseEntity(data, HttpStatus.OK);
    }
}
