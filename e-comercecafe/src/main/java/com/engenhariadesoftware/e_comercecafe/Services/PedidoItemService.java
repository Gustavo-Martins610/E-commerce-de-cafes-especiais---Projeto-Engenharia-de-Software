package com.engenhariadesoftware.e_comercecafe.Services;

import com.engenhariadesoftware.e_comercecafe.Models.PedidoItemModel;
import com.engenhariadesoftware.e_comercecafe.Repositories.PedidoItemRepository;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class PedidoItemService {

    @Autowired
    private PedidoItemRepository pedidoItemRepository;

    public List<PedidoItemModel> listarItens() {
        return pedidoItemRepository.findAll();
    }

    public Optional<PedidoItemModel> buscarPorId(Long id) {
        return pedidoItemRepository.findById(id);
    }

    public PedidoItemModel salvar(PedidoItemModel item) {
        return pedidoItemRepository.save(item);
    }

    public void deletar(Long id) {
        pedidoItemRepository.deleteById(id);
    }
}
