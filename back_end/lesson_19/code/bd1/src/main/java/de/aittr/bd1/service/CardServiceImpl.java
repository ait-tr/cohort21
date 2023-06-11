package de.aittr.bd1.service;

import de.aittr.bd1.dto.CardRequestDTO;
import de.aittr.bd1.dto.CardResponseDTO;
import de.aittr.bd1.entity.Card;
import de.aittr.bd1.repository.CardRepository;
import lombok.RequiredArgsConstructor;
import org.modelmapper.ModelMapper;
import org.modelmapper.TypeToken;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@RequiredArgsConstructor
public class CardServiceImpl implements CardService{

    private final CardRepository cardRepository;
    private final ModelMapper mapper;



    @Override
    public List<CardResponseDTO> getListOfCard() {
        List<Card> entities = cardRepository.findAll();
        List<CardResponseDTO> dtos = mapper.map(entities, new TypeToken<List<CardResponseDTO>>() {
        }.getType());
        return dtos;
    }

    @Override
    public void addCard(CardRequestDTO cardRequestDTO) {
        cardRepository.save(mapper.map(cardRequestDTO, Card.class));
    }
}
