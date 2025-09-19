package com.engenhariadesoftware.e_comercecafe.Mappers;

import com.engenhariadesoftware.e_comercecafe.Models.CarrinhoItemModel;
import com.engenhariadesoftware.e_comercecafe.DTOs.Resquest.CarrinhoItemRequestDTO;
import com.engenhariadesoftware.e_comercecafe.DTOs.Response.CarrinhoItemResponseDTO;
import org.mapstruct.Mapper;
import org.mapstruct.Mapping;

@Mapper(componentModel = "spring")
public interface CarrinhoItemMapper {

    @Mapping(target = "id", ignore = true)
    CarrinhoItemModel toEntity(CarrinhoItemRequestDTO dto);

    CarrinhoItemResponseDTO toResponse(CarrinhoItemModel model);
}
