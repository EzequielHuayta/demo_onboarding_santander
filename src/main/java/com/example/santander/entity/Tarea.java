package com.example.santander.entity;


import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.antlr.v4.runtime.misc.NotNull;

import java.util.Date;
import java.util.Set;

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
    private String descripcion;

    private Date fechaFin;


    @OneToMany(mappedBy = "tarea")
    private Set<TareaDetalle> tareaDetalles;
}
