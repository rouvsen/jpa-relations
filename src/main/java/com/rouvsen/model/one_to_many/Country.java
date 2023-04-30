package com.rouvsen.model.one_to_many;

import jakarta.persistence.*;

import java.util.List;

@Entity
@Table(name = "country")
public class Country {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String name;

    //Main Entity is Country (Main,Mother Entity)

    @OneToMany(
            mappedBy = "country",
            cascade = CascadeType.ALL
    )
    private List<City> cities;
}
