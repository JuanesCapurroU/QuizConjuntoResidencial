package com.example.ConjuntoResidencial.services;

import com.example.ConjuntoResidencial.models.Visitante;
import com.example.ConjuntoResidencial.repositories.VisitanteRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class VisitanteServiceImpl implements VisitanteService {

    @Autowired
    private VisitanteRepository visitanteRepositorio;

    @Override
    public List<Visitante> obtenerTodosLosVisitantes() {
        return visitanteRepositorio.findAll();
    }

    @Override
    public List<Visitante> obtenerVisitantesPorPropietario(Long id_propietario) {
        return visitanteRepositorio.findByPropietarioId(id_propietario);
    }

    @Override
    public Visitante guardarVisitante(Visitante visitante) {
        return visitanteRepositorio.save(visitante);
    }

    @Override
    public void eliminarVisitante(Long id) {
        visitanteRepositorio.deleteById(id);
    }
}

