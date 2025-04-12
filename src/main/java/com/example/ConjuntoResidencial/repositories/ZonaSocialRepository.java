package com.example.ConjuntoResidencial.repositories;

import com.example.ConjuntoResidencial.models.Zona_social;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ZonaSocialRepository extends JpaRepository<Zona_social, Long> {
}
