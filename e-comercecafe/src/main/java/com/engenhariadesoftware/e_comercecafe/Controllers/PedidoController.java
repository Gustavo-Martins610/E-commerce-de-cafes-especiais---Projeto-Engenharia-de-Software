package com.engenhariadesoftware.e_comercecafe.Controllers;

import com.engenhariadesoftware.e_comercecafe.DTOs.Request.PedidoRequestDTO;
import com.engenhariadesoftware.e_comercecafe.DTOs.Response.PedidoResponseDTO;
import com.engenhariadesoftware.e_comercecafe.Services.PedidoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/pedidos")
public class PedidoController {

    @Autowired
    private PedidoService pedidoService;

    @GetMapping
    public List<PedidoResponseDTO> listarTodos() {
        return pedidoService.listarTodos();
    }

    @GetMapping("/{id}")
    public ResponseEntity<PedidoResponseDTO> buscarPorId(@PathVariable Long id) {
        return pedidoService.buscarPorId(id)
                .map(ResponseEntity::ok)
                .orElse(ResponseEntity.notFound().build());
    }

    @PostMapping
    public PedidoResponseDTO criar(@RequestBody PedidoRequestDTO dto) {
        return pedidoService.salvar(dto);
    }

    @DeleteMapping("/{id}")
    public ResponseEntity<Void> deletar(@PathVariable Long id) {
        pedidoService.deletar(id);
        return ResponseEntity.noContent().build();
    }
}
