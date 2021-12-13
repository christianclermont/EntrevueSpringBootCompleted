package com.example.entrevueSpringBoot.repository.entity;

import lombok.Data;

import javax.persistence.*;
import java.io.Serializable;
import java.util.Set;

@Entity
@Table(name = "film")
@Data
public class FilmEntity implements Serializable {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private long id;

    @Column(name = "titre")
    private String titre;

    @Column(name = "description")
    private String description;

    @Column(name = "acteurs")
    @OneToMany
    @OrderColumn(name = "nom")
    private Set<ActeurEntity> acteurs;
}