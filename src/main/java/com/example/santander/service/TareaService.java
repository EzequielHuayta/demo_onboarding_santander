package com.example.santander.service;


import com.example.santander.entity.Tarea;
import com.example.santander.repository.TareaRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class TareaService {

    @Autowired
    private TareaRepository tareaRepository;


    public List<Tarea> findTareasById() {
        return null;
    }
}
