package de.aittr.bd1.dto;

import de.aittr.bd1.entity.CardType;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor

public class CardResponseDTO {

    private Long id;

    private String number;

    private String owner;

    private CardType cardType;

}
