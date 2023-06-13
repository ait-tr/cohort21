package de.aittr.bd1.dto;

import de.aittr.bd1.entity.Account;
import de.aittr.bd1.entity.CardType;
import jakarta.persistence.Column;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor

public class CardRequestDTO {

    private String number;

    private String owner;

    private CardType cardType;

    private Long account;

}
