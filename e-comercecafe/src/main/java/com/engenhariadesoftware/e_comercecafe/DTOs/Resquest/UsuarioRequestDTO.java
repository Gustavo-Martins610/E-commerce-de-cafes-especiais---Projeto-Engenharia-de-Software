package com.engenhariadesoftware.e_comercecafe.DTOs.Resquest;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter

public class UsuarioRequestDTO {
    private String nome;
    private String cpf;
    private String email;
    private String senha;
}