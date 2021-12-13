package com.example.entrevueSpringBoot.mapper;

import com.example.entrevueSpringBoot.model.Film;
import com.example.entrevueSpringBoot.repository.entity.FilmEntity;
import org.mapstruct.Mapper;
import org.mapstruct.factory.Mappers;

@Mapper(componentModel = "spring", uses = {ActeurMapper.class})
public interface FilmMapper {
    FilmMapper INSTANCE = Mappers.getMapper(FilmMapper.class);

    FilmEntity toEntity(Film film);

    Film toModel(FilmEntity entity);
}
