package com.example.santander.repository;

import com.example.santander.entity.Usuario;
import org.springframework.data.jpa.repository.JpaRepository;

public interface UsuarioRepository extends JpaRepository<Usuario, Integer> {

    Usuario findByLegajo(String legajo);


}
