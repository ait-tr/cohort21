package de.ait.city.controller;


import de.ait.city.dto.CityRequestDTO;
import de.ait.city.dto.CityResponseDTO;
import de.ait.city.service.CityServiceImpl;
import lombok.AllArgsConstructor;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@AllArgsConstructor
@RestController
@RequestMapping("/cities")
public class CityController {
    private CityServiceImpl service;

    @GetMapping("")
    public List<CityResponseDTO> listCity (){
        return service.getAllCities();
    }

    @PostMapping("")
    @ResponseStatus(code= HttpStatus.CREATED)
    public CityResponseDTO createCity(@RequestBody CityRequestDTO city){
        return service.addCity(city);
    }

}
