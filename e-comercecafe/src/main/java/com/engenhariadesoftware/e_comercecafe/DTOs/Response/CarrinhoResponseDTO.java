package com.engenhariadesoftware.e_comercecafe.DTOs.Response;


import lombok.Getter;
import lombok.Setter;
import java.util.List;

@Getter
@Setter
public class CarrinhoResponseDTO {
    private Long idCarrinho;
    private Long usuarioId;
    private List<CarrinhoItemResponseDTO> itens;
}
