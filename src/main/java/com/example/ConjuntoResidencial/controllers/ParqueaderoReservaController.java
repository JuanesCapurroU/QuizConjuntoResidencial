package com.example.ConjuntoResidencial.controllers;

import com.example.ConjuntoResidencial.models.Reserva_parqueadero;
import com.example.ConjuntoResidencial.services.ReservaParqueaderoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/parqueadero-reserva")
public class ParqueaderoReservaController {

    @Autowired
    private ReservaParqueaderoService reservaService;

    @GetMapping
    public List<Reserva_parqueadero> listarTodas() {
        return reservaService.obtenerTodasLasReservas();
    }

    @GetMapping("/propietario/{idPropietario}")
    public List<Reserva_parqueadero> listarPorPropietario(@PathVariable Long id_propietario) {
        return reservaService.obtenerReservasPorPropietario(id_propietario);
    }

    @PostMapping
    public Reserva_parqueadero crear(@RequestBody Reserva_parqueadero reserva) {
        return reservaService.guardarReserva(reserva);
    }

    @DeleteMapping("/{id}")
    public void eliminar(@PathVariable Long id) {
        reservaService.eliminarReserva(id);
    }
}

