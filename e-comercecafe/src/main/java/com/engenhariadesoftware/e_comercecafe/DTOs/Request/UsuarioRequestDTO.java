package com.engenhariadesoftware.e_comercecafe.DTOs.Request;

import lombok.*;

@Data
@Builder
@NoArgsConstructor
@AllArgsConstructor
public class UsuarioRequestDTO {
    private String nome;
    private String cpf;
    private String email;
    private String senha;
    private String tipo; // opcional: cliente ou admin
}
