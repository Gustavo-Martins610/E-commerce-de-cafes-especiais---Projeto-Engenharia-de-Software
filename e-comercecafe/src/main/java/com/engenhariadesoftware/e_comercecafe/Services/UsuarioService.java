package com.engenhariadesoftware.e_comercecafe.Services;

import com.engenhariadesoftware.e_comercecafe.Models.UsuarioModel;
import com.engenhariadesoftware.e_comercecafe.Repositories.UsuarioRepository;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class UsuarioService {

    @Autowired
    private UsuarioRepository usuarioRepository;

    public List<UsuarioModel> listarUsuarios() {
        return usuarioRepository.findAll();
    }

    public Optional<UsuarioModel> buscarPorId(Long id) {
        return usuarioRepository.findById(id);
    }

    public UsuarioModel salvar(UsuarioModel usuario) {
        return usuarioRepository.save(usuario);
    }

    public void deletar(Long id) {
        usuarioRepository.deleteById(id);
    }
}
