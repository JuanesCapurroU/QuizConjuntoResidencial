package com.example.ConjuntoResidencial.models;

import jakarta.persistence.*;

import java.time.LocalDate;
import java.time.LocalTime;

@Entity
public class Reserva_zona {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long id_reserva;
    private LocalDate fecha;
    private LocalTime hora_inicio;

    @ManyToOne
    @JoinColumn(name = "id_zona")
    private Zona_social zona_social;

    @ManyToOne
    @JoinColumn(name = "id_propietario")
    private Propietario propietario;

    public Reserva_zona() {
    }

    public Reserva_zona(long id_reserva, LocalDate fecha, LocalTime hora_inicio, Zona_social zona_social) {
        this.id_reserva = id_reserva;
        this.fecha = fecha;
        this.hora_inicio = hora_inicio;
        this.zona_social = zona_social;
    }

    public long getId_reserva() {
        return id_reserva;
    }

    public void setId_reserva(long id_reserva) {
        this.id_reserva = id_reserva;
    }

    public LocalDate getFecha() {
        return fecha;
    }

    public void setFecha(LocalDate fecha) {
        this.fecha = fecha;
    }

    public LocalTime getHora_inicio() {
        return hora_inicio;
    }

    public void setHora_inicio(LocalTime hora_inicio) {
        this.hora_inicio = hora_inicio;
    }

    public Zona_social getZona_social() {
        return zona_social;
    }

    public void setZona_social(Zona_social zona_social) {
        this.zona_social = zona_social;
    }

    @Override
    public String toString() {
        return "Reserva_zona{" +
                "id_reserva=" + id_reserva +
                ", fecha=" + fecha +
                ", hora_inicio=" + hora_inicio +
                ", zona_social=" + zona_social +
                '}';
    }
}
