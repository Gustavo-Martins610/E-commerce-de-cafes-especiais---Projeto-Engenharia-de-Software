package com.engenhariadesoftware.e_comercecafe.Services;

import com.engenhariadesoftware.e_comercecafe.DTOs.Request.UsuarioRequestDTO;
import com.engenhariadesoftware.e_comercecafe.DTOs.Response.UsuarioResponseDTO;
import com.engenhariadesoftware.e_comercecafe.Models.UsuarioModel;
import com.engenhariadesoftware.e_comercecafe.Repositories.UsuarioRepository;
import com.engenhariadesoftware.e_comercecafe.ValueObjects.*;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class UsuarioService {

    @Autowired
    private UsuarioRepository usuarioRepository;

    public List<UsuarioResponseDTO> listarTodos() {
        return usuarioRepository.findAll().stream()
                .map(this::toResponse)
                .toList();
    }

    public Optional<UsuarioResponseDTO> buscarPorId(Long id) {
        return usuarioRepository.findById(id).map(this::toResponse);
    }

    public UsuarioResponseDTO salvar(UsuarioRequestDTO usuarioRequestDTO) {
        UsuarioModel model;
        model = UsuarioModel.builder()
                .nome(usuarioRequestDTO.getNome())
                .cpf(new CPF(usuarioRequestDTO.getCpf()))
                .email(new Email(usuarioRequestDTO.getEmail()))
                .senha(new Senha(usuarioRequestDTO.getSenha()))
                .role(usuarioRequestDTO.getRole())
                .build();
                
        return toResponse(usuarioRepository.save(model));
    }

    public void deletar(Long id) {
        usuarioRepository.deleteById(id);
    }

    private UsuarioResponseDTO toResponse(UsuarioModel usuarioModel) {
        return UsuarioResponseDTO.builder()
                .idUsuario(usuarioModel.getIdUsuario())
                .nome(usuarioModel.getNome())
                .cpf(usuarioModel.getCpf().getValue())
                .email(usuarioModel.getEmail().getValue())
                .role(usuarioModel.getRole())
                .build();
    }
}
