package entity;


import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

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

    private boolean finalizado;
    private String descripcion;
    private Date fechaFin;
    private int idUsuario;
}
