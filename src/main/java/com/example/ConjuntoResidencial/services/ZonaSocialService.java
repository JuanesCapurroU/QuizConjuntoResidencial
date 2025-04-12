package com.example.ConjuntoResidencial.services;

import com.example.ConjuntoResidencial.models.Zona_social;
import com.example.ConjuntoResidencial.repositories.ZonaSocialRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

public interface ZonaSocialService {
    List<Zona_social> obtenerTodasLasZonas();
    Optional<Zona_social> obtenerZonaPorId(Long id);
    Zona_social guardarZona(Zona_social zona);
    void eliminarZona(Long id);
}

