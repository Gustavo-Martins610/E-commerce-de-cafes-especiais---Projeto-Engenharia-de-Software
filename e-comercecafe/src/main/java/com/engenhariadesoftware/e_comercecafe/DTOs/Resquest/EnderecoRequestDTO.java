package com.engenhariadesoftware.e_comercecafe.DTOs.Resquest;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class EnderecoRequestDTO {
    private String cep;
    private String rua;
    private String numero;
    private String complemento;
    private String bairro;
    private String cidade;
    private String estado;
}