package de.aittr.bd1.dto;

import de.aittr.bd1.entity.ClientType;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.List;

@Data
@NoArgsConstructor
public class ClientResponseDTO {
    private Long id;
    private String name;
    private Integer age;
    private List<AccountResponseDTO> accounts;
    private ClientType type;
}
