package com.engenhariadesoftware.e_comercecafe.DTOs.Response;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class CarrinhoItemResponseDTO {
    private Long produtoId;
    private String nomeProduto;
    private Integer quantidade;
    private Double precoUnitario;
}

