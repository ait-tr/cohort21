package de.aittr.bd1.dto;

import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
public class AddressRequestDTO {
    private String country;
    private String city;
    private String street;
    private Integer houseNumber;
}
