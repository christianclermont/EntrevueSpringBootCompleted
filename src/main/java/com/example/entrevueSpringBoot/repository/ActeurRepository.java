package com.example.entrevueSpringBoot.repository;

import com.example.entrevueSpringBoot.repository.entity.ActeurEntity;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ActeurRepository extends JpaRepository<ActeurEntity, Long>  {
}
