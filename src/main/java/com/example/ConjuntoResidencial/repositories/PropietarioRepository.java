package com.example.ConjuntoResidencial.repositories;

import com.example.ConjuntoResidencial.models.Propietario;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import java.util.Optional;

@Repository
public interface PropietarioRepository extends JpaRepository<Propietario, Long> {

    //Listar el propietario con los visitantes que ha tenido
    @Query("SELECT propietario FROM Propietario propietario JOIN FETCH propietario.visitantes WHERE propietario.id = :id_propietario")
    Propietario obtenerPropietarioConVisitantes(@Param("idPropietario") Long id_propietario);


}
