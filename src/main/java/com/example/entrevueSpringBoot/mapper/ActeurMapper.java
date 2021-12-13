package com.example.entrevueSpringBoot.mapper;

import com.example.entrevueSpringBoot.model.Acteur;
import com.example.entrevueSpringBoot.repository.entity.ActeurEntity;
import org.mapstruct.Mapper;
import org.mapstruct.factory.Mappers;

@Mapper(componentModel = "spring")
public interface ActeurMapper {
    ActeurMapper INSTANCE = Mappers.getMapper(ActeurMapper.class);

    Acteur toModel(ActeurEntity entity);

    ActeurEntity toEntity(Acteur model);
}
