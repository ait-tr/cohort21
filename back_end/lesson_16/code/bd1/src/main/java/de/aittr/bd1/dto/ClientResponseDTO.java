package de.aittr.bd1.dto;

import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
public class ClientResponseDTO {
    private Long id;
    private String name;
    private AccountResponseDTO account;
}
