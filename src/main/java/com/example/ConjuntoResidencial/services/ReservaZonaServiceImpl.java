package com.example.ConjuntoResidencial.services;

import com.example.ConjuntoResidencial.models.Reserva_zona;
import com.example.ConjuntoResidencial.repositories.ReservaParqueaderoRepository;
import com.example.ConjuntoResidencial.repositories.ReservaZonaRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.time.LocalDate;
import java.util.List;

@Service
public class ReservaZonaServiceImpl implements ReservaZonaService {

    @Autowired
    private ReservaZonaRepository reservaZonaRepository;

    @Override
    public List<Reserva_zona> obtenerTodasLasReservas() {
        return reservaZonaRepository.findAll();
    }

    @Override
    public Reserva_zona guardarReserva(Reserva_zona reserva) {
        return reservaZonaRepository.save(reserva);
    }

    @Override
    public void eliminarReserva(Long id) {
        reservaZonaRepository.deleteById(id);
    }

    @Override
    public List<Reserva_zona> obtenerReservasPorPropietario(Long id_propietario) {
        return reservaZonaRepository.findByPropietarioId(id_propietario);
    }

    @Override
    public List<Reserva_zona> obtenerReservasPorFecha(LocalDate fecha) {
        return reservaZonaRepository.obtenerReservasZonaPorFecha(fecha);
    }
}
