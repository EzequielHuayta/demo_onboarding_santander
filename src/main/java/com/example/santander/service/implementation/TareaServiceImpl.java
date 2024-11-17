package com.example.santander.service.implementation;

import com.example.santander.dto.TareaDTO;
import com.example.santander.dto.UsuarioDTO;
import com.example.santander.entity.Tarea;
import com.example.santander.entity.TareaDetalle;
import com.example.santander.entity.Usuario;
import com.example.santander.repository.TareaDetalleRepository;
import com.example.santander.repository.TareaRepository;
import com.example.santander.repository.UsuarioRepository;
import com.example.santander.service.TareaService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

@Service
public class TareaServiceImpl implements TareaService {
    @Autowired
    TareaRepository tareaRepository;

    @Autowired
    TareaDetalleRepository tareaDetalleRepository;

    @Autowired
    UsuarioRepository usuarioRepository;


    @Override
    public List<TareaDTO> findTareasByUserId(UsuarioDTO user) {
        Usuario usuario = usuarioRepository.findByLegajo(user.getLegajo());
        List<TareaDetalle> tareaDetalles = tareaDetalleRepository.findByUsuarioId(usuario.getId());
        List<TareaDTO> listTareaDTO = new ArrayList<>();

      
        tareaDetalles.forEach(tareaDetalle -> {
            Tarea tarea = tareaDetalle.getTarea();
            TareaDTO tareaDTO = new TareaDTO();
            tareaDTO.setDescripcion(tarea.getDescripcion());
            tareaDTO.setFechaFin(tarea.getFechaFin());
            tareaDTO.setFinalizado(tareaDetalle.isFinalizado());
            listTareaDTO.add(tareaDTO);
        });

        return listTareaDTO;
    }


}