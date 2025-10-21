package com.api.backend.entity;

import com.api.backend.config.enums.CiudadesEnum;
import jakarta.persistence.*;
import lombok.Data;

import java.util.List;

@Entity
@Table(name = "vuelos")
@Data
public class Vuelo {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long idVuelo;

    @Enumerated(EnumType.STRING)
    private CiudadesEnum origen;

    @Enumerated(EnumType.STRING)
    private CiudadesEnum salida;

    @ManyToOne
    @JoinColumn(name = "id_avion")
    private Avion avion;

    @OneToMany(mappedBy = "vuelo")
    private List<AsientoVuelo> asientosVuelos;
}
