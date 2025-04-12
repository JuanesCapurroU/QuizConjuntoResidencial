package com.example.ConjuntoResidencial.services;

import com.example.ConjuntoResidencial.models.Propietario;
import com.example.ConjuntoResidencial.repositories.PropietarioRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class PropietarioServiceImpl implements PropietarioService {

    @Autowired
    private PropietarioRepository propietarioRepositorio;

    @Override
    public List<Propietario> obtenerTodosLosPropietarios() {
        return propietarioRepositorio.findAll();
    }

    @Override
    public Optional<Propietario> obtenerPropietarioPorId(Long id) {
        return propietarioRepositorio.findById(id);
    }

    @Override
    public Propietario guardarPropietario(Propietario propietario) {
        return propietarioRepositorio.save(propietario);
    }

    @Override
    public void eliminarPropietario(Long id) {
        propietarioRepositorio.deleteById(id);
    }

    @Override
    public Propietario obtenerPropietarioConVisitantes(Long id_propietario) {
        return propietarioRepositorio.obtenerPropietarioConVisitantes(id_propietario);
    }
}

