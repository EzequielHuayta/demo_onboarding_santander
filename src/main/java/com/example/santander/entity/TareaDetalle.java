package com.example.santander.entity;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.antlr.v4.runtime.misc.NotNull;

@Data
@NoArgsConstructor
@AllArgsConstructor
@Entity
@Table(name = "tarea_detalle")
public class TareaDetalle {

    @EmbeddedId
    private TareaDetalleIdPK id;

    @ManyToOne
    @MapsId("usuarioId")
    @JoinColumn(name = "usuario_id")
    private Usuario usuario;

    @ManyToOne
    @MapsId("tareaId")
    @JoinColumn(name = "tarea_id")
    private Tarea tarea;

    @NotNull
    private boolean finalizado;
}