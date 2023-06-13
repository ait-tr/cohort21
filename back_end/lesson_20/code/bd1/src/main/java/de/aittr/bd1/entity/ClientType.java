package de.aittr.bd1.entity;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.RequiredArgsConstructor;

import java.util.Arrays;

@Getter
@AllArgsConstructor
public enum ClientType {
    NORMAL(10),
    VIP(20);
    private Integer typeId;


    // ClientType type = ClientType.findByTypeId(20)
    public static ClientType findByTypeId(Integer typeId) {
        if (typeId == null) {
            return null;
        }

        return Arrays.stream(ClientType.values())
                .filter(ct -> ct.getTypeId().equals(typeId))
                .findFirst()
                .orElse(null);
    }

}
