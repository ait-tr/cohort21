package de.aittr.bd1.controller;

import de.aittr.bd1.dto.ClientRequestDTO;
import de.aittr.bd1.dto.ClientResponseDTO;
import de.aittr.bd1.service.ClientService;
import lombok.RequiredArgsConstructor;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.*;

import java.util.List;


@RestController
@RequiredArgsConstructor
@RequestMapping("clients")
public class ClientController {
    private final ClientService service;

    @GetMapping(name="")
    public List<ClientResponseDTO> getList(){
        return service.getList();
    }

    @GetMapping("/{id}")
    public ClientResponseDTO getClient(@PathVariable(name = "id") Long id){
        return service.getClient(id);
    }

    @PostMapping(name="")
    @ResponseStatus(code= HttpStatus.CREATED)
    public ClientResponseDTO addClient(@RequestBody ClientRequestDTO client){
        return service.addClient(client);
    }

    @PutMapping(name="/{id}")
    public ClientResponseDTO addClient(@PathVariable(name="id") Long id, @RequestBody ClientRequestDTO client){
        return service.updateClient(id,client);
    }

    @DeleteMapping(name="/{id}")
    public void addClient(@PathVariable(name="id") Long id){
        service.deleteClient(id);
    }


}
