package com.api.backend.entity;

import jakarta.persistence.*;
import lombok.Data;

import java.util.List;
import java.util.UUID;

@Data
@Entity
@Table(name = "tiquetes")
public class Tiquete {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long idTiquete;

    private String codigo = UUID.randomUUID().toString();

    @ManyToOne
    @JoinColumn(name = "id_asiento")
    private Asiento asientos;

    @OneToOne
    @JoinColumn(name = "id_vuelo")
    private Vuelo vuelo;

    @OneToOne(cascade = CascadeType.ALL)
    @JoinColumn(name = "id_pago")
    private Pago pago;

    @ManyToOne
    @JoinColumn(name = "id_reserva")
    private Reserva reserva;
}
