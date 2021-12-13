package com.example.entrevueSpringBoot.model;

import lombok.Data;
import lombok.NoArgsConstructor;

/**
 * Modele principal pour l'API Film.
 */
@Data
@NoArgsConstructor
public class Film {
    private long id;
    private String titre;
    private String description;
    private Acteur[] acteurs;
}
