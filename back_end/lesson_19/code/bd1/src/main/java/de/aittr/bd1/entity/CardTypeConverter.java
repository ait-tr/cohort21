package de.aittr.bd1.entity;

import jakarta.persistence.AttributeConverter;
import jakarta.persistence.Converter;

@Converter(autoApply = true)
public class CardTypeConverter implements AttributeConverter<CardType, Integer> {
    @Override
    public Integer convertToDatabaseColumn(CardType attribute) {
        return attribute == null ? null:attribute.getCardTypeId();
    }

    @Override
    public CardType convertToEntityAttribute(Integer typeId) {
        return typeId == null ? null : CardType.findByTypeId(typeId);
    }
}
