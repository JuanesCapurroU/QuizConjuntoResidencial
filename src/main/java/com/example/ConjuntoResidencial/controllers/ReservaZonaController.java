package com.example.ConjuntoResidencial.controllers;

import com.example.ConjuntoResidencial.models.Reserva_zona;
import com.example.ConjuntoResidencial.services.ReservaZonaService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.format.annotation.DateTimeFormat;
import org.springframework.web.bind.annotation.*;

import java.time.LocalDate;
import java.util.List;

@RestController
@RequestMapping("/api/reservas-zona")
public class ReservaZonaController {

    @Autowired
    private ReservaZonaService reservaZonaService;

    @GetMapping
    public List<Reserva_zona> listarTodas() {
        return reservaZonaService.obtenerTodasLasReservas();
    }

    @PostMapping
    public Reserva_zona guardar(@RequestBody Reserva_zona reserva) {
        return reservaZonaService.guardarReserva(reserva);
    }


    @DeleteMapping("/{id}")
    public void eliminar(@PathVariable Long id) {
        reservaZonaService.eliminarReserva(id);
    }

    @GetMapping("/por-propietario/{idPropietario}")
    public List<Reserva_zona> obtenerPorPropietario(@PathVariable Long id_propietario) {
        return reservaZonaService.obtenerReservasPorPropietario(id_propietario);
    }

    @GetMapping("/por-fecha")
    public List<Reserva_zona> obtenerPorFecha(@RequestParam String fecha) {
        LocalDate fechaParseada = LocalDate.parse(fecha);
        return reservaZonaService.obtenerReservasPorFecha(fechaParseada);
    }
}