package com.example.ConjuntoResidencial.services;

import com.example.ConjuntoResidencial.models.Visitante;
import com.example.ConjuntoResidencial.repositories.VisitanteRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

public interface VisitanteService {
    List<Visitante> obtenerTodosLosVisitantes();
    List<Visitante> obtenerVisitantesPorPropietario(Long id_propietario);
    Visitante guardarVisitante(Visitante visitante);
    void eliminarVisitante(Long id);
}

