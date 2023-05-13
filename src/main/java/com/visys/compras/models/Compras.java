package com.visys.compras.models;

import lombok.Data;
import lombok.Generated;

import javax.persistence.*;
import java.time.LocalDateTime;

@Data
@Entity
@Table(name = "compra")
public class Compras {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(name = "user_id", nullable = false)
    private Long userId;

    @Column(name = "inmueble_id", nullable = false)
    private Long inmuebleId;

    @Column(name = "tittle")
    private String tittle;

    @Column(name = "price", nullable = false)
    private Double price;

    //@Column(name = "dateBuy")
    //private LocalDateTime dateBuy;
}
