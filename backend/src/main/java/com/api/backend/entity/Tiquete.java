package com.api.backend.entity;

import jakarta.persistence.*;
import lombok.Data;

import java.util.List;

@Data
@Entity
@Table(name = "tiquetes")
public class Tiquete {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long idTiquete;

    private List<Asiento> asientos;

    @OneToOne
    @JoinColumn(name = "id_vuelo")
    private Vuelo vuelo;

    @OneToOne(cascade = CascadeType.ALL)
    private Pago pago;

}
