package com.example.santander.repository;

import com.example.santander.entity.TareaDetalle;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface TareaDetalleRepository extends JpaRepository<TareaDetalle, Integer> {
    List<TareaDetalle> findByUsuarioId(int idUsuario);
}
