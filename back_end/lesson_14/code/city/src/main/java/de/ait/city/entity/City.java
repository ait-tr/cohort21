package de.ait.city.entity;

import jakarta.persistence.*;
import lombok.*;

@Entity
@Table(name="town")

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@ToString

public class City {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name="id", unique = true)
    private Long id;

    @Column(name ="name")
    private String name;

    @Column(name = "country")
    private String country;

    @Column(name = "population")
    private int population;

    @Column(name="area")
    private int area;
}
