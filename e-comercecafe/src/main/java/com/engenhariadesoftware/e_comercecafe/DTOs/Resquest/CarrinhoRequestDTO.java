package com.engenhariadesoftware.e_comercecafe.DTOs.Resquest;

import lombok.Getter;
import lombok.Setter;
import java.util.List;

@Getter
@Setter
public class CarrinhoRequestDTO {
    private Long usuarioId;
    private List<CarrinhoItemRequestDTO> itens;
}
