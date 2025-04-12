package com.example.ConjuntoResidencial.services;

import com.example.ConjuntoResidencial.models.Zona_social;
import com.example.ConjuntoResidencial.repositories.ZonaSocialRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class ZonaSocialServiceImpl implements ZonaSocialService {

    @Autowired
    private ZonaSocialRepository zonaSocialRepositorio;

    @Override
    public List<Zona_social> obtenerTodasLasZonas() {
        return zonaSocialRepositorio.findAll();
    }

    @Override
    public Optional<Zona_social> obtenerZonaPorId(Long id) {
        return zonaSocialRepositorio.findById(id);
    }

    @Override
    public Zona_social guardarZona(Zona_social zona) {
        return zonaSocialRepositorio.save(zona);
    }

    @Override
    public void eliminarZona(Long id) {
        zonaSocialRepositorio.deleteById(id);
    }
}

