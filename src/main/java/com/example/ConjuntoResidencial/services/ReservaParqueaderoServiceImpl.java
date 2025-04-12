package com.example.ConjuntoResidencial.services;

import com.example.ConjuntoResidencial.models.Reserva_parqueadero;
import com.example.ConjuntoResidencial.repositories.ReservaParqueaderoRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ReservaParqueaderoServiceImpl implements ReservaParqueaderoService {

    @Autowired
    private ReservaParqueaderoRepository reservaParqueaderoRepositorio;

    @Override
    public List<Reserva_parqueadero> obtenerTodasLasReservas() {
        return reservaParqueaderoRepositorio.findAll();
    }

    @Override
    public List<Reserva_parqueadero> obtenerReservasPorPropietario(Long id_propietario) {
        return reservaParqueaderoRepositorio.obtenerParqueaderosAsignadosPorPropietario(id_propietario);
    }

    @Override
    public Reserva_parqueadero guardarReserva(Reserva_parqueadero reserva) {
        return reservaParqueaderoRepositorio.save(reserva);
    }

    @Override
    public void eliminarReserva(Long id) {
        reservaParqueaderoRepositorio.deleteById(id);
    }
}

