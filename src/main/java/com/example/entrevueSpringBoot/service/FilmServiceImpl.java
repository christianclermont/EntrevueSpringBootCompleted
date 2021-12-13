package com.example.entrevueSpringBoot.service;

import com.example.entrevueSpringBoot.mapper.ActeurMapper;
import com.example.entrevueSpringBoot.mapper.FilmMapper;
import com.example.entrevueSpringBoot.model.Film;
import com.example.entrevueSpringBoot.repository.ActeurRepository;
import com.example.entrevueSpringBoot.repository.FilmRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import static java.util.Arrays.stream;
import static java.util.stream.Collectors.toSet;

/**
 * Classe d'implémentation du service pouvant contenir au besoin de la logique d'affaire.
 */
@Service
public class FilmServiceImpl implements FilmService {

    @Autowired
    private FilmRepository filmRepository;

    @Autowired
    private ActeurRepository acteurRepository;

    @Autowired
    private FilmMapper filmMapper;

    @Autowired
    private ActeurMapper acteurMapper;

    public Film findFilmById(long id) {
        var entity = filmRepository.findById(id);
        return filmMapper.toModel(entity.orElseThrow());
    }

    public Long createFilm(Film film) {
        var savedActeurs =  stream(film.getActeurs())
                .map(acteurMapper::toEntity)
                .map(acteurRepository::save)
                .collect(toSet());

        var entity = filmMapper.toEntity(film);
        entity.setActeurs(savedActeurs);

        return filmRepository.saveAndFlush(entity).getId();
    }
}
