package com.engenhariadesoftware.e_comercecafe.DTOs.Resquest;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class PedidoItemRequestDTO {
    private Long produtoId;
    private Integer quantidade;
}
