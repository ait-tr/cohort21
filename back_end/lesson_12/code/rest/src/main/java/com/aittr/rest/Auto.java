package com.aittr.rest;

import lombok.Getter;
import lombok.Setter;

@Setter
@Getter
public class Auto {
    private int id;
    private String brand;
    private String plate;
    private  int year;

    public Auto(int id, String brand, String plate, int year) {
        this.id = id;
        this.brand = brand;
        this.plate = plate;
        this.year = year;
    }

}
