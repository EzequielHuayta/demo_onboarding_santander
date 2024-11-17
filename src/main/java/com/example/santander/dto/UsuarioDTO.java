package com.example.santander.dto;


import lombok.*;

@Data
@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
public class UsuarioDTO {
    private String legajo;
    private String contraseña;
    private String nombre;
}
