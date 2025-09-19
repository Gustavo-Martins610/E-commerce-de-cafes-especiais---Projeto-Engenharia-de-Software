package com.engenhariadesoftware.e_comercecafe.Services;

import com.engenhariadesoftware.e_comercecafe.Models.PedidoModel;
import com.engenhariadesoftware.e_comercecafe.Repositories.PedidoRepository;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class PedidoService {

    @Autowired
    private PedidoRepository pedidoRepository;


    public List<PedidoModel> listarPedidos() {
        return pedidoRepository.findAll();
    }

    public Optional<PedidoModel> buscarPorId(Long id) {
        return pedidoRepository.findById(id);
    }

    public PedidoModel salvar(PedidoModel pedido) {
        return pedidoRepository.save(pedido);
    }

    public void deletar(Long id) {
        pedidoRepository.deleteById(id);
    }
}
