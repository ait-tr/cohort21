package de.aittr.bd1.dto;

import de.aittr.bd1.entity.ClientType;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
public class ClientRequestDTO {
    private String name;
    private Integer age;
    private ClientType type;

}
