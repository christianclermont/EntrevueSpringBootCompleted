package com.example.entrevueSpringBoot.service;

import com.example.entrevueSpringBoot.model.Film;

/**
 * Definition du service Film.
 */
public interface FilmService {

    /**
     * Recherche un film par son Id.
     * @param id Identifiant du film recherché.
     * @return Un objet contenant les informations du film.
     */
    Film findFilmById(long id);

    /**
     * Crée une nouvelle instance d'un film.
     * @param film Données du film à créer.
     * @return Identifiant du film.
     */
    Long createFilm(Film film);
}
