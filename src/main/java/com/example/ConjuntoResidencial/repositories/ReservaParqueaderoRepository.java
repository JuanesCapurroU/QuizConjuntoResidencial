package com.example.ConjuntoResidencial.repositories;

import com.example.ConjuntoResidencial.models.Reserva_parqueadero;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface ReservaParqueaderoRepository extends JpaRepository<Reserva_parqueadero, Long> {

    //listar  cuales son los parqueaderos que tiene asignado un propietario
    @Query("SELECT reservaParqueadero FROM Reserva_parqueadero reservaParqueadero WHERE reservaParqueadero.propietario.id = :id_propietario")
    List<Reserva_parqueadero> obtenerParqueaderosAsignadosPorPropietario(@Param("idPropietario") Long id_propietario);

}
