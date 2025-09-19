package com.engenhariadesoftware.e_comercecafe.DTOs.Response;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class UsuarioResponseDTO {
    private Long idUsuario;
    private String nome;
    private String cpf;
    private String email;
    private String tipo;
    private String createdAt;
}
