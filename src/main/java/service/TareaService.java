package service;


import entity.Tarea;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import repository.TareaRepository;

import java.util.List;

@Service
public class TareaService {

    @Autowired
    private TareaRepository tareaRepository;


    public List<Tarea> findTareasById() {
        return null;
    }
}
