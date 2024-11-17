package com.example.santander.dto;


import com.fasterxml.jackson.annotation.JsonIgnore;
import lombok.*;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class UsuarioDTO {
    private String legajo;
    @JsonIgnore
    private String Contrasenia;
    private String nombre;
    private int id;
}
