package com.example.ConjuntoResidencial.models;

import jakarta.persistence.*;

import java.time.LocalDate;
import java.time.LocalTime;

@Entity
public class Reserva_parqueadero {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long id_reserva;
    private LocalDate fecha;
    private LocalTime hora_inicio;

    @ManyToOne
    @JoinColumn(name = "id_propietario")
    private Propietario propietario;

    public Reserva_parqueadero() {
    }

    public Reserva_parqueadero(long id_reserva, LocalDate fecha, LocalTime hora_inicio, Propietario propietario) {
        this.id_reserva = id_reserva;
        this.fecha = fecha;
        this.hora_inicio = hora_inicio;
        this.propietario = propietario;
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

    public Propietario getPropietario() {
        return propietario;
    }

    public void setPropietario(Propietario propietario) {
        this.propietario = propietario;
    }

    @Override
    public String toString() {
        return "Reserva_parqueadero{" +
                "id_reserva=" + id_reserva +
                ", fecha=" + fecha +
                ", hora_inicio=" + hora_inicio +
                ", propietario=" + propietario +
                '}';
    }
}
