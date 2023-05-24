package com.aittr.rest;

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

    public int getId() {
        return id;
    }

    public String getBrand() {
        return brand;
    }

    public String getPlate() {
        return plate;
    }

    public int getYear() {
        return year;
    }
}
