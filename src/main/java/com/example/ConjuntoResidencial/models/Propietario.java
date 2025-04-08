package com.example.ConjuntoResidencial.models;

import jakarta.persistence.*;

import java.time.LocalDate;
import java.time.LocalTime;
import java.util.List;

@Entity
public class Propietario {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long id_propietario;
    private String nombre;
    private String cedula;
    @Column(name = "fecha_visita", columnDefinition = "DATE")
    private LocalDate fecha_visita;
    @Column(name = "hora_entrada", columnDefinition = "TIME")
    private LocalTime hora_entrada;

    @OneToMany(mappedBy = "propietario", cascade = CascadeType.ALL, orphanRemoval = true)
    private List<Reserva_parqueadero> reserva_parqueaderos;

    @OneToMany(mappedBy = "propietario", cascade = CascadeType.ALL, orphanRemoval = true)
    private List<Visitante> visitantes;

    @OneToMany(mappedBy = "propietario", cascade = CascadeType.ALL, orphanRemoval = true)
    private List<Reserva_zona> reserva_zonas;


    public Propietario() {
    }

    public Propietario(long id_propietario, String nombre, String cedula, LocalDate fecha_visita, LocalTime hora_entrada, List<Reserva_parqueadero> reserva_parqueaderos, List<Visitante> visitantes, List<Reserva_zona> reserva_zonas) {
        this.id_propietario = id_propietario;
        this.nombre = nombre;
        this.cedula = cedula;
        this.fecha_visita = fecha_visita;
        this.hora_entrada = hora_entrada;
        this.reserva_parqueaderos = reserva_parqueaderos;
        this.visitantes = visitantes;
        this.reserva_zonas = reserva_zonas;
    }

    public long getId_propietario() {
        return id_propietario;
    }

    public void setId_propietario(long id_propietario) {
        this.id_propietario = id_propietario;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getCedula() {
        return cedula;
    }

    public void setCedula(String cedula) {
        this.cedula = cedula;
    }

    public LocalDate getFecha_visita() {
        return fecha_visita;
    }

    public void setFecha_visita(LocalDate fecha_visita) {
        this.fecha_visita = fecha_visita;
    }

    public LocalTime getHora_entrada() {
        return hora_entrada;
    }

    public void setHora_entrada(LocalTime hora_entrada) {
        this.hora_entrada = hora_entrada;
    }

    public List<Reserva_parqueadero> getReserva_parqueaderos() {
        return reserva_parqueaderos;
    }

    public void setReserva_parqueaderos(List<Reserva_parqueadero> reserva_parqueaderos) {
        this.reserva_parqueaderos = reserva_parqueaderos;
    }

    public List<Visitante> getVisitantes() {
        return visitantes;
    }

    public void setVisitantes(List<Visitante> visitantes) {
        this.visitantes = visitantes;
    }

    public List<Reserva_zona> getReserva_zonas() {
        return reserva_zonas;
    }

    public void setReserva_zonas(List<Reserva_zona> reserva_zonas) {
        this.reserva_zonas = reserva_zonas;
    }

    @Override
    public String toString() {
        return "Propietario{" +
                "id_propietario=" + id_propietario +
                ", nombre='" + nombre + '\'' +
                ", cedula='" + cedula + '\'' +
                ", fecha_visita=" + fecha_visita +
                ", hora_entrada=" + hora_entrada +
                ", reserva_parqueaderos=" + reserva_parqueaderos +
                ", visitantes=" + visitantes +
                ", reserva_zonas=" + reserva_zonas +
                '}';
    }
}
