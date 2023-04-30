package com.rouvsen.model.one_to_one;

import jakarta.persistence.*;

@Entity
@Table(name = "country")
public class Country {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String name;

    //Main Entity is Country (Main,Mother Entity)
    //map olur -> City-deki country variable-ina
    //cascadeType Main Entity-de yazilir
    //FetchType - iki Entity-de de

    @OneToOne(
            mappedBy = "country",
            cascade = CascadeType.ALL,
            fetch = FetchType.LAZY
    )
    private City city;
}
