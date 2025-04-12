package com.example.ConjuntoResidencial.repositories;

import com.example.ConjuntoResidencial.models.Visitante;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface VisitanteRepository extends JpaRepository<Visitante, Long> {

    List<Visitante> findByPropietarioId(Long id_propietario);

}
