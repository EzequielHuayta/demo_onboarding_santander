package com.example.santander.entity;


import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.antlr.v4.runtime.misc.NotNull;

import java.util.Date;

@Data
@NoArgsConstructor
@AllArgsConstructor
@Entity
@Table(name = "DDS_TAREAS")
public class Tarea {

    @Id
    @GeneratedValue
    private int id;

    @NotNull
    private boolean finalizado;

    @NotNull
    private String descripcion;

    private Date fechaFin;

    @NotNull
    private int idUsuario;
}