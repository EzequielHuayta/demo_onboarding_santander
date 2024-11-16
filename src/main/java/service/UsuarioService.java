package service;

import dto.UsuarioDTO;
import entity.Usuario;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import repository.UsuarioRepository;

@Service
public class UsuarioService {

    @Autowired
    private UsuarioRepository usuarioRepository;

    public Usuario findUsuarioById() {
        return null;
    }

    public boolean autenticarUsuario(UsuarioDTO usuarioDTO) {
        return false;
    }
}
