package entity;


import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import lombok.AllArgsConstructor;
import lombok.NoArgsConstructor;

@Entity
@NoArgsConstructor
@AllArgsConstructor
@Table(name = "DDS_USUARIOS")
public class Usuario {

    @Id
    @GeneratedValue
    int id;
    int nombre;
    int apellido;
    int legajo;

}
