package com.example.ConjuntoResidencial.controllers;

import com.example.ConjuntoResidencial.models.Zona_social;
import com.example.ConjuntoResidencial.services.ZonaSocialService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/zonas-sociales")
public class ZonaSocialController {

    @Autowired
    private ZonaSocialService zonaSocialService;

    @GetMapping
    public List<Zona_social> listarTodas() {
        return zonaSocialService.obtenerTodasLasZonas();
    }

    @GetMapping("/{id}")
    public ResponseEntity<Zona_social> obtenerPorId(@PathVariable Long id) {
        return zonaSocialService.obtenerZonaPorId(id)
                .map(ResponseEntity::ok)
                .orElse(ResponseEntity.notFound().build());
    }

    @PostMapping
    public Zona_social crear(@RequestBody Zona_social zona) {
        return zonaSocialService.guardarZona(zona);
    }

    @DeleteMapping("/{id}")
    public void eliminar(@PathVariable Long id) {
        zonaSocialService.eliminarZona(id);
    }
}

