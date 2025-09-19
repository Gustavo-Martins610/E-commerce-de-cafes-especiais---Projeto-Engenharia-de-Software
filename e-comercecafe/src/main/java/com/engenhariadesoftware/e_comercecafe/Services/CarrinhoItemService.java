package com.engenhariadesoftware.e_comercecafe.Services;

import com.engenhariadesoftware.e_comercecafe.Models.CarrinhoItemModel;
import com.engenhariadesoftware.e_comercecafe.Repositories.CarrinhoItemRepository;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class CarrinhoItemService {

    @Autowired
    private CarrinhoItemRepository carrinhoItemRepository;

    public List<CarrinhoItemModel> listarItens() {
        return carrinhoItemRepository.findAll();
    }

    public Optional<CarrinhoItemModel> buscarPorId(Long id) {
        return carrinhoItemRepository.findById(id);
    }

    public CarrinhoItemModel salvar(CarrinhoItemModel item) {
        return carrinhoItemRepository.save(item);
    }

    public void deletar(Long id) {
        carrinhoItemRepository.deleteById(id);
    }
}
