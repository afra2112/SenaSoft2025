package com.api.backend.entity;

import jakarta.persistence.*;
import lombok.Data;

import java.time.LocalDateTime;

@Entity
@Table(name = "pagos")
@Data
public class Pago {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long idPago;

    private LocalDateTime fecha;

    private Long valorAPagar;

    private String metodoPago;

    @ManyToOne
    @JoinColumn(name = "id_pasajero")
    private Pasajero pasajero;
}
