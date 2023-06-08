package de.aittr.bd1.dto;

import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
public class AddressResponseDTO {
    private Long id;
    private String country;
    private String city;
    private String street;
    private Integer houseNumber;
}
