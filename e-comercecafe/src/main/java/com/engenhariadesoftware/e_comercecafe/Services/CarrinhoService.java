package com.engenhariadesoftware.e_comercecafe.Services;

import com.engenhariadesoftware.e_comercecafe.Models.CarrinhoModel;
import com.engenhariadesoftware.e_comercecafe.Repositories.CarrinhoRepository;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class CarrinhoService {

    @Autowired
    private CarrinhoRepository carrinhoRepository;

    public List<CarrinhoModel> listarCarrinhos() {
        return carrinhoRepository.findAll();
    }

    public Optional<CarrinhoModel> buscarPorId(Long id) {
        return carrinhoRepository.findById(id);
    }

    public CarrinhoModel salvar(CarrinhoModel carrinho) {
        return carrinhoRepository.save(carrinho);
    }

    public void deletar(Long id) {
        carrinhoRepository.deleteById(id);
    }
}
