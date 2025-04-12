package com.example.ConjuntoResidencial.controllers;

import com.example.ConjuntoResidencial.models.Propietario;
import com.example.ConjuntoResidencial.services.PropietarioService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping("/api/propietarios")
public class PropietarioController {

    @Autowired
    private PropietarioService propietarioService;

    @GetMapping
    public List<Propietario> listarTodos() {
        return propietarioService.obtenerTodosLosPropietarios();
    }

    @GetMapping("/{id}")
    public Optional<Propietario> obtenerPorId(@PathVariable Long id_propietario) {
        return propietarioService.obtenerPropietarioPorId(id_propietario);
    }

    @PostMapping
    public Propietario guardar(@RequestBody Propietario propietario) {
        return propietarioService.guardarPropietario(propietario);
    }

    @DeleteMapping("/{id}")
    public void eliminar(@PathVariable Long id_propietario) {
        propietarioService.eliminarPropietario(id_propietario);
    }

    @GetMapping("/{id}/visitantes")
    public Propietario obtenerConVisitantes(@PathVariable Long id_propietario) {
        return propietarioService.obtenerPropietarioConVisitantes(id_propietario);
    }
}
