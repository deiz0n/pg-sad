package com.example.demo.service;

import com.example.demo.model.Usuario;
import com.example.demo.repository.UsuarioRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class UsuarioService {

    @Autowired
    private UsuarioRepository usuarioRepository;

    public List<Usuario> getAllUsuarios() {
        var usuarios = usuarioRepository.findAll();
        return usuarios;
    }

    public Usuario getUsuarioByID(Long id) {
        var usuario = usuarioRepository.findById(id);
        return usuario.get();
    }

    public Usuario addUsuario(Usuario usuario) {
        return usuarioRepository.save(usuario);
    }

    public void delUsuario(Long id) {
        usuarioRepository.deleteById(id);
    }

}
