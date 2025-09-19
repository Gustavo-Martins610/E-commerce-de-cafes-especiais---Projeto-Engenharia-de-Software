package com.engenhariadesoftware.e_comercecafe.Mappers;

import com.engenhariadesoftware.e_comercecafe.Models.UsuarioModel;
import com.engenhariadesoftware.e_comercecafe.DTOs.Resquest.UsuarioRequestDTO;
import com.engenhariadesoftware.e_comercecafe.DTOs.Response.UsuarioResponseDTO;
import org.mapstruct.Mapper;
import org.mapstruct.Mapping;

@Mapper(componentModel = "spring")
public interface UsuarioMapper {

    // DTO -> Model
    @Mapping(target = "idUsuario", ignore = true)
    @Mapping(target = "tipo", constant = "cliente")
    @Mapping(target = "createdAt", expression = "java(java.time.LocalDateTime.now())")
    UsuarioModel toEntity(UsuarioRequestDTO dto);

    // Model -> DTO
    @Mapping(target = "createdAt", expression = "java(model.getCreatedAt().toString())")
    UsuarioResponseDTO toResponse(UsuarioModel model);
}
