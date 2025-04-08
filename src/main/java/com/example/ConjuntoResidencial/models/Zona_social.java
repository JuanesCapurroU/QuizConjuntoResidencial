package com.example.ConjuntoResidencial.models;

import jakarta.persistence.*;

import java.util.List;

@Entity
public class Zona_social {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long id_zona;
    private String nombre;
    private String ubicacion;
    private Integer capacidad;

    @OneToMany(mappedBy = "zona_social", cascade = CascadeType.ALL, orphanRemoval = true)
    private List<Reserva_zona> reserva_zonas;


    public Zona_social() {
    }

    public Zona_social(long id_zona, String nombre, String ubicacion, Integer capacidad, List<Reserva_zona> reserva_zonas) {
        this.id_zona = id_zona;
        this.nombre = nombre;
        this.ubicacion = ubicacion;
        this.capacidad = capacidad;
        this.reserva_zonas = reserva_zonas;
    }

    public long getId_zona() {
        return id_zona;
    }

    public void setId_zona(long id_zona) {
        this.id_zona = id_zona;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getUbicacion() {
        return ubicacion;
    }

    public void setUbicacion(String ubicacion) {
        this.ubicacion = ubicacion;
    }

    public Integer getCapacidad() {
        return capacidad;
    }

    public void setCapacidad(Integer capacidad) {
        this.capacidad = capacidad;
    }

    public List<Reserva_zona> getReserva_zonas() {
        return reserva_zonas;
    }

    public void setReserva_zonas(List<Reserva_zona> reserva_zonas) {
        this.reserva_zonas = reserva_zonas;
    }

    @Override
    public String toString() {
        return "Zona_social{" +
                "id_zona=" + id_zona +
                ", nombre='" + nombre + '\'' +
                ", ubicacion='" + ubicacion + '\'' +
                ", capacidad=" + capacidad +
                ", reserva_zonas=" + reserva_zonas +
                '}';
    }
}
