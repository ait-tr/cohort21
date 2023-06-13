package de.aittr.bd1.controller;

import de.aittr.bd1.dto.AccountRequestDTO;
import de.aittr.bd1.dto.AccountResponseDTO;
import de.aittr.bd1.dto.ClientRequestDTO;
import de.aittr.bd1.dto.ClientResponseDTO;
import de.aittr.bd1.service.AccountService;
import de.aittr.bd1.service.ClientService;
import lombok.RequiredArgsConstructor;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.*;

import java.util.List;


@RestController
@RequiredArgsConstructor
@RequestMapping("clients")
public class ClientController {
    private final ClientService clientService;
    private final AccountService accountService;

    @GetMapping("")
    public List<ClientResponseDTO> getList(){
        return clientService.getList();
    }

    @GetMapping("/{id}")
    public ClientResponseDTO getClient(@PathVariable(name = "id") Long id){
        return clientService.getClient(id);
    }

    @PostMapping(value="")
    @ResponseStatus(code= HttpStatus.CREATED)
    public ClientResponseDTO addClient(@RequestBody ClientRequestDTO client){
        return clientService.addClient(client);
    }

    @PutMapping(value="/{id}")
    public ClientResponseDTO updateClient(@PathVariable(name="id") Long id, @RequestBody ClientRequestDTO client){
        return clientService.updateClient(id,client);
    }

    @DeleteMapping(value="/{id}")
    public void addClient(@PathVariable(name="id") Long id){
        clientService.deleteClient(id);
    }


    //post   /clients/{id}/accounts
    @PostMapping(value = "/{id}/accounts")
    @ResponseStatus(code = HttpStatus.CREATED)
    public AccountResponseDTO addAccount (@PathVariable(name="id") Long clientId, @RequestBody AccountRequestDTO account){
        AccountResponseDTO accountResponseDTO =accountService.addAccount(account,clientId);
        return accountResponseDTO;
    }

    @GetMapping("/qwe")
    public List<ClientResponseDTO> getListQwe(@RequestParam(name="age") Integer age){
        return clientService.getListByAge(age);
    }

}
