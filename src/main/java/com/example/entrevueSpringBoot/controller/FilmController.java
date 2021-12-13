package com.example.entrevueSpringBoot.controller;

import com.example.entrevueSpringBoot.model.Film;
import com.example.entrevueSpringBoot.service.FilmService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/api/film")
public class FilmController {

    @Autowired
    FilmService service;

    @GetMapping("{id}")
    public Film getFilm(@PathVariable("id") long id) {
        return service.findFilmById(id);
    }

    @PostMapping
    public ResponseEntity<Long> createFilm(@RequestBody Film film) {
        Long id = service.createFilm(film);
        return ResponseEntity.ok(id);
    }
}
