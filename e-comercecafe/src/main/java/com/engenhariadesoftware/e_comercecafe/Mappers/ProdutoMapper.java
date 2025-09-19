package com.engenhariadesoftware.e_comercecafe.Mappers;

import com.engenhariadesoftware.e_comercecafe.Models.ProdutoModel;
import com.engenhariadesoftware.e_comercecafe.DTOs.Resquest.ProdutoRequestDTO;
import com.engenhariadesoftware.e_comercecafe.DTOs.Response.ProdutoResponseDTO;
import org.mapstruct.Mapper;
import org.mapstruct.Mapping;

@Mapper(componentModel = "spring")
public interface ProdutoMapper {
    @Mapping(target = "idProduto", ignore = true)
    @Mapping(target = "createdAt", expression = "java(java.time.LocalDateTime.now())")
    ProdutoModel toEntity(ProdutoRequestDTO dto);

    @Mapping(target = "createdAt", expression = "java(model.getCreatedAt().toString())")
    ProdutoResponseDTO toResponse(ProdutoModel model);
}
