package com.example.ConjuntoResidencial.services;

import com.example.ConjuntoResidencial.models.Propietario;
import com.example.ConjuntoResidencial.repositories.PropietarioRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;


public interface PropietarioService {
    List<Propietario> obtenerTodosLosPropietarios();
    Optional<Propietario> obtenerPropietarioPorId(Long id);
    Propietario guardarPropietario(Propietario propietario);
    void eliminarPropietario(Long id);
    Propietario obtenerPropietarioConVisitantes(Long id_propietario);
}
