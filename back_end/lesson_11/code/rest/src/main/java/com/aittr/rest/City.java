package com.aittr.rest;

import io.swagger.v3.oas.annotations.media.Schema;
import jakarta.persistence.*;


@Entity
@Table(name = "city")
public class City {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id", unique = true)
    private Long id;
    @Schema (description = "Название города", type = "string")
    @Column(name = "name")
    private String name;
    @Column(name = "country")
    private String country;
    @Column(name = "population")
    private int population;

    @Column(name = "square")
    private double square;

    public City(String name, String country, int population, double square) {
        this.id=null;
        this.name = name;
        this.country = country;
        this.population = population;
        this.square = square;
    }

    public Long getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public String getCountry() {
        return country;
    }

    public int getPopulation() {
        return population;
    }

    public double getSquare() {
        return square;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setCountry(String country) {
        this.country = country;
    }

    public void setPopulation(int population) {
        this.population = population;
    }

    public void setSquare(double square) {
        this.square = square;
    }
}
