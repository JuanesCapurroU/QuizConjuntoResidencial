package com.example.ConjuntoResidencial.services;

import com.example.ConjuntoResidencial.models.Reserva_zona;
import com.example.ConjuntoResidencial.repositories.ReservaZonaRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.time.LocalDate;
import java.util.List;

public interface ReservaZonaService {

    List<Reserva_zona> obtenerTodasLasReservas();
    Reserva_zona guardarReserva(Reserva_zona reserva);
    void eliminarReserva(Long id);
    List<Reserva_zona> obtenerReservasPorPropietario(Long id_propietario);
    List<Reserva_zona> obtenerReservasPorFecha(LocalDate fecha);
}


