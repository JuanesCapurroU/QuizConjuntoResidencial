package com.example.ConjuntoResidencial.controllers;

import com.example.ConjuntoResidencial.models.Visitante;
import com.example.ConjuntoResidencial.services.VisitanteService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/visitantes")
public class VisitanteController {

    @Autowired
    private VisitanteService visitanteService;

    @GetMapping
    public List<Visitante> listarTodos() {
        return visitanteService.obtenerTodosLosVisitantes();
    }

    @GetMapping("/propietario/{idPropietario}")
    public List<Visitante> listarPorPropietario(@PathVariable Long id_propietario) {
        return visitanteService.obtenerVisitantesPorPropietario(id_propietario);
    }

    @PostMapping
    public Visitante crear(@RequestBody Visitante visitante) {
        return visitanteService.guardarVisitante(visitante);
    }

    @DeleteMapping("/{id}")
    public void eliminar(@PathVariable Long id) {
        visitanteService.eliminarVisitante(id);
    }
}

