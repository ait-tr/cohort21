package de.aittr.bd1.entity;

import com.fasterxml.jackson.annotation.JsonCreator;
import lombok.AllArgsConstructor;
import lombok.Getter;

import java.util.Arrays;

@AllArgsConstructor
@Getter
public enum CardType {
    VISA(1,"visa_card"),
    MAESTRO(2,"maestro_card"),
    MASTERCARD(3, "master_card"),
    GIRO(4, "giro_card");
    private final Integer cardTypeId;
    private final String externalTypeId;

    public static CardType findByTypeId(Integer typeId){
        if(typeId == null){
            return null;
        }

        return Arrays.stream(CardType.values())
                .filter(ct-> ct.getCardTypeId().equals(typeId))
                .findFirst()
                .orElse(null);
    }

    @JsonCreator
    public static CardType findByExternalTypeId(String typeId){
        if(typeId == null){
            return null;
        }

        return Arrays.stream(CardType.values())
                .filter(ct-> ct.getExternalTypeId().equals(typeId))
                .findFirst()
                .orElse(null);
    }


}
