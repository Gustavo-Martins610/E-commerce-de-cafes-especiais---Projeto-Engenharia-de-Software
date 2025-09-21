package com.engenhariadesoftware.e_comercecafe.Controllers;

import com.engenhariadesoftware.e_comercecafe.DTOs.Request.EnderecoRequestDTO;
import com.engenhariadesoftware.e_comercecafe.DTOs.Response.EnderecoResponseDTO;
import com.engenhariadesoftware.e_comercecafe.Services.EnderecoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.security.access.prepost.PreAuthorize;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/enderecos")
public class EnderecoController {

    @Autowired
    private EnderecoService enderecoService;

    @PreAuthorize("hasRole('ADMIN')")
    @GetMapping
    public List<EnderecoResponseDTO> listarTodos() {
        return enderecoService.listarTodos();
    }
    
    @PreAuthorize("hasRole('ADMIN')")
    @GetMapping("/{id}")
    public ResponseEntity<EnderecoResponseDTO> buscarPorId(@PathVariable Long id) {
        return enderecoService.buscarPorId(id)
                .map(ResponseEntity::ok)
                .orElse(ResponseEntity.notFound().build());
    }


    @PostMapping
    public EnderecoResponseDTO criar(@RequestBody EnderecoRequestDTO enderecoRequestDTO) {
        return enderecoService.salvar(enderecoRequestDTO);
    }

    @DeleteMapping("/{id}")
    public ResponseEntity<Void> deletar(@PathVariable Long id) {
        enderecoService.deletar(id);
        return ResponseEntity.noContent().build();
    }
}
