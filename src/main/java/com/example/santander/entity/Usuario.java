package com.example.santander.entity;


import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.antlr.v4.runtime.misc.NotNull;

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
    String contraseña;
}
