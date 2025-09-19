package com.engenhariadesoftware.e_comercecafe.DTOs.Resquest;

import lombok.Getter;
import lombok.Setter;
import java.util.List;


@Getter
@Setter
public class PedidoRequestDTO {
    private Long usuarioId;
    private Long enderecoId;
    private List<PedidoItemRequestDTO> itens;
}
