package com.api.backend.entity;


import jakarta.persistence.*;
import lombok.Data;

import java.util.List;

@Entity
@Table(name = "asientos")
@Data
public class Asiento {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long idAsiento;

    private String nombre; //ejemplo 29F

    private boolean disponible;

    @OneToMany
    private List<AsientoVuelo> asientosVuelos;
}
