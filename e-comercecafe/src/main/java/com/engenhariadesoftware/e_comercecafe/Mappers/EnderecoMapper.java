package com.engenhariadesoftware.e_comercecafe.Mappers;

import com.engenhariadesoftware.e_comercecafe.Models.EnderecoModel;
import com.engenhariadesoftware.e_comercecafe.DTOs.Resquest.EnderecoRequestDTO;
import com.engenhariadesoftware.e_comercecafe.DTOs.Response.EnderecoResponseDTO;
import org.mapstruct.Mapper;

@Mapper(componentModel = "spring")
public interface EnderecoMapper {
    EnderecoModel toEntity(EnderecoRequestDTO dto);
    EnderecoResponseDTO toResponse(EnderecoModel model);
}
