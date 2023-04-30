package com.rouvsen.model.many_to_many;

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

    @ManyToMany(
            cascade = CascadeType.ALL,
            fetch = FetchType.LAZY
    )
    @JoinTable(
            name = "country_city",
            joinColumns = @JoinColumn(name = "country_id"),
            inverseJoinColumns = @JoinColumn(name = "city_id")
    )
    private List<City> cities;
}
