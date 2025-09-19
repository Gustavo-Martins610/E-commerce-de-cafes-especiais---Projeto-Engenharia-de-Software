package com.engenhariadesoftware.e_comercecafe.Controllers;

import com.engenhariadesoftware.e_comercecafe.DTOs.Request.UsuarioRequestDTO;
import com.engenhariadesoftware.e_comercecafe.DTOs.Response.UsuarioResponseDTO;
import com.engenhariadesoftware.e_comercecafe.Services.UsuarioService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/usuarios")
public class UsuarioController {

    @Autowired
    private UsuarioService usuarioService;

    @GetMapping
    public List<UsuarioResponseDTO> listarTodos() {
        return usuarioService.listarTodos();
    }

    @GetMapping("/{id}")
    public ResponseEntity<UsuarioResponseDTO> buscarPorId(@PathVariable Long id) {
        return usuarioService.buscarPorId(id)
                .map(ResponseEntity::ok)
                .orElse(ResponseEntity.notFound().build());
    }

    @PostMapping
    public UsuarioResponseDTO criar(@RequestBody UsuarioRequestDTO dto) {
        return usuarioService.salvar(dto);
    }

    @DeleteMapping("/{id}")
    public ResponseEntity<Void> deletar(@PathVariable Long id) {
        usuarioService.deletar(id);
        return ResponseEntity.noContent().build();
    }
}
