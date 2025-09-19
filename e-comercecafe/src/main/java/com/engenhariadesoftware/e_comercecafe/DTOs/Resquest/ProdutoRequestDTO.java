package com.engenhariadesoftware.e_comercecafe.DTOs.Resquest;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class ProdutoRequestDTO {
    private String nome;
    private String descricao;
    private Double preco;
    private Integer estoque;
    private String categoria;
    private String imagemUrl;
}
