package com.aittr.rest;

import io.swagger.v3.oas.annotations.media.Schema;
import jakarta.persistence.*;
import lombok.*;

//Entity <==> Tabl
@Setter
@Getter
//@AllArgsConstructor

@ToString
@EqualsAndHashCode
@Builder


//@RequiredArgsConstructor

@Entity
@Table(name = "city")
public class City {


    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id", unique = true)
    private Long id;
    @Schema (description = "Название города", type = "string")
    @Column(name = "name")
    private  final String name;
    @Column(name = "country")
    private String country;
    @Column(name = "population")
    private int population;

    @Column(name = "square")
    private double square;



}
