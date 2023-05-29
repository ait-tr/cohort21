package com.aittr.rest;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class CityServiceImpl implements CityService{
        private CityRepository repository;

    @Autowired
    public CityServiceImpl(CityRepository repository) {
        this.repository = repository;
    }


   /*
        static final List<City> cities = new ArrayList<>(
                List.of(
                        new City(1L,"Berlin", "Germany", 553_645_000, 891.8),
                        new City(2L,"London", "United Kingdom", 8_982_000, 1572),
                        new City(3L,"New York", "USA", 8_468_000, 783.8),
                        new City(4L,"Oslo", "Norway",634_293, 454),
                        new City(5L,"Tokyo", "Japan",13_960_000, 2194),
                        new City(6L,"Reykjavik", "Iceland",122_853, 273),
                        new City(7L,"Paris", "USA",24_171, 96),
                        new City(8L,"Paris", "France",2_161_000, 105.4)
                )
        );

         */

    @Override
    public List<City> getAllCities() {
        List<City> cities = new ArrayList<>();
        repository.findAll().forEach(c->cities.add(c));
        City city= City.builder()
                //.name("Moscow")
                .population(1888888)
                .country("RF").build();
        return cities;
    }

    @Override
    public List<City> getAllCities(String country) {
        return null; //cities.stream().filter(a->a.getCountry().equals(country)).toList();
    }

    @Override
    public City getCity(int id) {
        return null; //cities.stream().filter(a->a.getId()==id).findAny().get();
    }

    @Override
    public City addCity(City city) {
        repository.save(city);
        return city;
    }

    @Override
    public City removeCity(City city) {
        return null;
    }

    @Override
    public City updateCity(City city) {
        return null;
    }
}
