package com.example.santander.dto;


import com.fasterxml.jackson.annotation.JsonIgnore;
import lombok.*;

@Data
@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
public class UsuarioDTO {
    private String legajo;
    @JsonIgnore
    private String Contrasenia;
    private String nombre;
}
