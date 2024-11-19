package com.example.santander.controller;


import com.example.santander.dto.TareaDTO;
import com.example.santander.dto.UsuarioDTO;
import com.example.santander.dto.response.ResponseDTO;
import com.example.santander.entity.Tarea;
import com.example.santander.service.TareaService;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Map;

@RestController
@Slf4j
@RequestMapping("/home")
public class TareaController {

    @Autowired
    private TareaService tareaService;
    @GetMapping(value = "/tarea", produces ="application/json")
    public ResponseEntity<ResponseDTO<List<TareaDTO>>> tarea(@RequestHeader Map<String, String> headers) {
        log.info("Llamando al servicio de tareas para el legajo {}: ", headers.get("legajo"));

        String legajo = headers.get("legajo");

        UsuarioDTO usuarioDTO = new UsuarioDTO();
        usuarioDTO.setLegajo(legajo);

        List<TareaDTO> tareas = tareaService.findTareasByUserId(usuarioDTO);

        ResponseDTO<List<TareaDTO>> data = new ResponseDTO<>(tareas);
        log.info("Response data: {}", data.getData());

        return new ResponseEntity<>(data, HttpStatus.OK);
    }
}
