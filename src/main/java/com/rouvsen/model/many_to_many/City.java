package com.rouvsen.model.many_to_many;

import jakarta.persistence.*;

import java.util.List;


@Entity
@Table(name = "city")
public class City {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String name;

    @ManyToMany(
            mappedBy = "cities",
            fetch = FetchType.LAZY
    )
    private List<Country> countries;
}
