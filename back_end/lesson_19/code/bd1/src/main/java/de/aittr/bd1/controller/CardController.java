package de.aittr.bd1.controller;

import de.aittr.bd1.dto.CardRequestDTO;
import de.aittr.bd1.dto.CardResponseDTO;
import de.aittr.bd1.service.CardService;
import lombok.RequiredArgsConstructor;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/cards")

@RequiredArgsConstructor
public class CardController {
    private final CardService cardService;

    @GetMapping("")
    public List<CardResponseDTO> getCards(){
        return cardService.getListOfCard();
    }

    @PostMapping("")
    @ResponseStatus(code = HttpStatus.CREATED)
    public void addCard(@RequestBody CardRequestDTO card){
        cardService.addCard(card);
    }

}
