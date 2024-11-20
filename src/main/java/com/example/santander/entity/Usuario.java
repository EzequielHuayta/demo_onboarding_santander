package com.example.santander.entity;


import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.antlr.v4.runtime.misc.NotNull;

import java.util.Set;

@Data
@Entity
@NoArgsConstructor
@AllArgsConstructor
@Table(name = "DDS_USUARIOS")
public class Usuario {

    @Id
    @GeneratedValue
    int id;

    @NotNull
    String nombre;
    @NotNull
    String apellido;
    @NotNull
    String legajo;
    @NotNull
    String contrasenia;


    @OneToMany(mappedBy = "usuario")
    private Set<TareaDetalle> tareaDetalles;
}
