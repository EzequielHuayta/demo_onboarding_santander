package com.example.santander.dto;


import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.Date;

@Data
@NoArgsConstructor
@AllArgsConstructor

public class TareaDTO {

    private String descripcion;

    private boolean finalizado;

    private Date fechaFin;

}
