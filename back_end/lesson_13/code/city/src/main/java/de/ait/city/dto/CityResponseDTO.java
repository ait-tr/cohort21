package de.ait.city.dto;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor


public class CityResponseDTO {
    private Long id;

    private String name;

    private String country;

    private int population;

    private int area;
}
