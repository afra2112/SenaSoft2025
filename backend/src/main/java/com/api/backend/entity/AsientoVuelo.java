package com.api.backend.entity;

import jakarta.persistence.*;
import lombok.Data;

@Data
@Entity
public class AsientoVuelo {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long idAsientoVuelo;

    private boolean disponible;

}
