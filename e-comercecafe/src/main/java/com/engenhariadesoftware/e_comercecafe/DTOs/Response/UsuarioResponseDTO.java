package com.engenhariadesoftware.e_comercecafe.DTOs.Response;

import lombok.*;
import java.time.LocalDateTime;
import java.util.List;

@Data
@Builder
@NoArgsConstructor
@AllArgsConstructor
public class UsuarioResponseDTO {
    private Long idUsuario;
    private String nome;
    private String cpf;
    private String email;
    private String tipo;
    private LocalDateTime createdAt;

    // Relacionamentos como listas de IDs
    private List<Long> enderecosIds;
    private Long carrinhoId;
    private List<Long> pedidosIds;
}
