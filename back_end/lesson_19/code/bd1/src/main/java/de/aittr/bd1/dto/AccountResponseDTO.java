package de.aittr.bd1.dto;

import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
public class AccountResponseDTO {
    private Long id;
    private String iban;
}
