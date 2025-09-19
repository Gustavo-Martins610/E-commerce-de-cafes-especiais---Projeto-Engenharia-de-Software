package com.engenhariadesoftware.e_comercecafe.Mappers;

import com.engenhariadesoftware.e_comercecafe.Models.PedidoModel;
import com.engenhariadesoftware.e_comercecafe.DTOs.Resquest.PedidoRequestDTO;
import com.engenhariadesoftware.e_comercecafe.DTOs.Response.PedidoResponseDTO;
import org.mapstruct.Mapper;
import org.mapstruct.Mapping;

@Mapper(componentModel = "spring")
public interface PedidoMapper {
    @Mapping(target = "idPedido", ignore = true)
    @Mapping(target = "status", constant = "aguardando")
    @Mapping(target = "createdAt", expression = "java(java.time.LocalDateTime.now())")
    PedidoModel toEntity(PedidoRequestDTO dto);

    @Mapping(target = "createdAt", expression = "java(model.getCreatedAt().toString())")
    PedidoResponseDTO toResponse(PedidoModel model);
}

