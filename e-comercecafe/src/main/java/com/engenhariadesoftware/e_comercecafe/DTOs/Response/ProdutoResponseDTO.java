package com.engenhariadesoftware.e_comercecafe.DTOs.Response;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class ProdutoResponseDTO {
    private Long idProduto;
    private String nome;
    private String descricao;
    private Double preco;
    private Integer estoque;
    private String categoria;
    private String imagemUrl;
    private String createdAt;
}