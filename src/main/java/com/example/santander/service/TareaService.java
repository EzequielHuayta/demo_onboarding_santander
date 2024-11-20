package com.example.santander.service;


import com.example.santander.dto.TareaDTO;
import com.example.santander.dto.UsuarioDTO;
import com.example.santander.entity.Tarea;
import com.example.santander.repository.TareaRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;


public interface TareaService {

    List<TareaDTO> findTareasByUserId(UsuarioDTO usuarioDTO);
}
