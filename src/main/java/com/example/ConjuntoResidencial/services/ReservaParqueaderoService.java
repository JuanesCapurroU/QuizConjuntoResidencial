package com.example.ConjuntoResidencial.services;

import com.example.ConjuntoResidencial.models.Reserva_parqueadero;
import com.example.ConjuntoResidencial.repositories.ReservaParqueaderoRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

public interface ReservaParqueaderoService {
    List<Reserva_parqueadero> obtenerTodasLasReservas();
    List<Reserva_parqueadero> obtenerReservasPorPropietario(Long id_propietario);
    Reserva_parqueadero guardarReserva(Reserva_parqueadero reserva);
    void eliminarReserva(Long id);
}

