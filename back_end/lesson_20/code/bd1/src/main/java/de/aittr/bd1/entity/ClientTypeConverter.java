package de.aittr.bd1.entity;

import jakarta.persistence.AttributeConverter;
import jakarta.persistence.Converter;

@Converter (autoApply = true)
public class ClientTypeConverter implements AttributeConverter<ClientType, Integer> {
    @Override
    public Integer convertToDatabaseColumn(ClientType attribute) {
        return attribute == null ? null:attribute.getTypeId();
    }

    @Override
    public ClientType convertToEntityAttribute(Integer typeId) {
       return typeId == null ? null : ClientType.findByTypeId(typeId);
    }
}
