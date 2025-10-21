package com.api.backend.entity;

import jakarta.persistence.*;
import lombok.Data;

import java.util.List;

@Entity
@Table(name = "aviones")
@Data
public class Avion {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long idAvion;

    private String modelo;

    private Integer capacidad;

    @OneToMany(mappedBy = "avion")
    private List<Vuelo> vuelos;

    @OneToMany(mappedBy = "avion")
    private List<Asiento> asientos;
}
