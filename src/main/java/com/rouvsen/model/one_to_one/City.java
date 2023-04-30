package com.rouvsen.model.one_to_one;

import jakarta.persistence.*;


@Entity
@Table(name = "city")
public class City {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String name;

    //City-de 'country_id' column yaranacaq
    //Country ile mapping edilecek

    @OneToOne(fetch = FetchType.LAZY)//
    @JoinColumn(name = "country_id")
    private Country country;
}
