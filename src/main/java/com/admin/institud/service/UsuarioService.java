package com.admin.institud.service;

import com.admin.institud.entity.UsuarioEntity;
import com.admin.institud.repository.UsuarioRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class UsuarioService {
    @Autowired
    private UsuarioRepository usuarioRepository;

    public UsuarioEntity usuarioLogin(UsuarioEntity usuario) {
        UsuarioEntity resulatado = usuarioRepository.findByNombre(usuario.getNombre());
        if (resulatado != null) {
            if (usuario.getPassword() != null && usuario.getPassword().equals(resulatado.getPassword())) {
                return resulatado;
            }
            return null;
        }
        return null;
    }
}
