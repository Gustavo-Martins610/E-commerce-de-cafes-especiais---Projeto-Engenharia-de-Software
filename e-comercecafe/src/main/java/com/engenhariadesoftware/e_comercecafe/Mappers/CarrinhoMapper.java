package com.engenhariadesoftware.e_comercecafe.Mappers;

import com.engenhariadesoftware.e_comercecafe.Models.CarrinhoModel;
import com.engenhariadesoftware.e_comercecafe.DTOs.Resquest.CarrinhoRequestDTO;
import com.engenhariadesoftware.e_comercecafe.DTOs.Response.CarrinhoResponseDTO;
import org.mapstruct.Mapper;
import org.mapstruct.Mapping;

@Mapper(componentModel = "spring")
public interface CarrinhoMapper {
    @Mapping(target = "idCarrinho", ignore = true)
    CarrinhoModel toEntity(CarrinhoRequestDTO dto);

    CarrinhoResponseDTO toResponse(CarrinhoModel model);
}
