package com.engenhariadesoftware.e_comercecafe.Services;

import com.engenhariadesoftware.e_comercecafe.Models.ProdutoModel;
import com.engenhariadesoftware.e_comercecafe.Repositories.ProdutoRepository;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class ProdutoService {

    @Autowired
    private ProdutoRepository produtoRepository;

    public List<ProdutoModel> listarProdutos() {
        return produtoRepository.findAll();
    }

    public Optional<ProdutoModel> buscarPorId(Long id) {
        return produtoRepository.findById(id);
    }

    public ProdutoModel salvar(ProdutoModel produto) {
        return produtoRepository.save(produto);
    }

    public void deletar(Long id) {
        produtoRepository.deleteById(id);
    }
}
