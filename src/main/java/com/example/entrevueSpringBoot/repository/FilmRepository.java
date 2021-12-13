package com.example.entrevueSpringBoot.repository;

import com.example.entrevueSpringBoot.repository.entity.FilmEntity;
import org.springframework.data.jpa.repository.JpaRepository;

public interface FilmRepository extends JpaRepository<FilmEntity, Long>  {
}
