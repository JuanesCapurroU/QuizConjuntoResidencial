package com.example.ConjuntoResidencial.repositories;

import com.example.ConjuntoResidencial.models.Reserva_zona;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import java.time.LocalDate;
import java.util.List;

@Repository
public interface ReservaZonaRepository extends JpaRepository<Reserva_zona, Long> {

    //mostrar las reservas de la zona social que ha hecho un propietario
    List<Reserva_zona> findByPropietarioId(Long id_propietario);

    //mostrar reservas de zona por fecha.
    @Query("SELECT reservaZona FROM Reserva_zona reservaZona WHERE reservaZona.fecha = :fecha")
    List<Reserva_zona> obtenerReservasZonaPorFecha(@Param("fecha") LocalDate fecha);




}
