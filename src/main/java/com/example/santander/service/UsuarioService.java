package com.example.santander.service;

import com.example.santander.dto.UsuarioDTO;
import com.example.santander.exceptions.UsuarioNotFoundException;


public interface UsuarioService {

    boolean autenticarUsuario(UsuarioDTO usuarioDTO) throws UsuarioNotFoundException;

}
