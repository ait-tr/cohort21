package de.aittr.bd1.service;

import de.aittr.bd1.dto.CardRequestDTO;
import de.aittr.bd1.dto.CardResponseDTO;
import de.aittr.bd1.entity.Card;

import java.util.List;

public interface CardService {

    public List<CardResponseDTO> getListOfCard();
    public void addCard(CardRequestDTO cardRequestDTO);
}
