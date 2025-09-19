package com.engenhariadesoftware.e_comercecafe.Mappers;

import com.engenhariadesoftware.e_comercecafe.Models.PedidoItemModel;
import com.engenhariadesoftware.e_comercecafe.DTOs.Resquest.PedidoItemRequestDTO;
import com.engenhariadesoftware.e_comercecafe.DTOs.Response.PedidoItemResponseDTO;
import org.mapstruct.Mapper;
import org.mapstruct.Mapping;

@Mapper(componentModel = "spring")
public interface PedidoItemMapper {

    @Mapping(target = "id", ignore = true)
    PedidoItemModel toEntity(PedidoItemRequestDTO dto);

    PedidoItemResponseDTO toResponse(PedidoItemModel model);
}
