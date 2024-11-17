package com.example.santander.service.implementation;


import com.example.santander.entity.Usuario;
import com.example.santander.dto.UsuarioDTO;
import com.example.santander.exceptions.UsuarioNotFoundException;
import com.example.santander.service.UsuarioService;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.example.santander.repository.UsuarioRepository;

@Service
@Slf4j
public class UsuarioServiceImpl implements UsuarioService {

    @Autowired
    private UsuarioRepository usuarioRepository;

    public boolean autenticarUsuario(UsuarioDTO usuarioDTO) {

        String legajo = usuarioDTO.getLegajo();
        String password = usuarioDTO.getContraseña();


        Usuario usuario = usuarioRepository.findByLegajo(legajo);

        //Si no se encuentra el usuario o si la contraseña del usuario encontrado no es valido devuelvo una respuesta usuario no encontrado
        if (usuario == null || !usuario.getContraseña().equals(password)) {
            throw new UsuarioNotFoundException("Usuario no encontrado o contraseña incorrecta");
        }
        return true;
    }
}
