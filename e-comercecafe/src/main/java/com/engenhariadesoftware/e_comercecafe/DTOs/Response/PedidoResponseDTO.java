package com.engenhariadesoftware.e_comercecafe.DTOs.Response;

import lombok.Getter;
import lombok.Setter;
import java.util.List;

@Getter
@Setter
public class PedidoResponseDTO {
    private Long idPedido;
    private String status;
    private String createdAt;
    private List<PedidoItemResponseDTO> itens;
}