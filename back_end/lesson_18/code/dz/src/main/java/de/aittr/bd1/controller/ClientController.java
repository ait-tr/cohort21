package de.aittr.bd1.controller;

import de.aittr.bd1.dto.*;
import de.aittr.bd1.service.AccountService;
import de.aittr.bd1.service.AddressService;
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
    private final AddressService addressService;

    @GetMapping("")
    public List<ClientResponseDTO> getList() {
        return clientService.getList();
    }

    @GetMapping("/{id}")
    public ClientResponseDTO getClient(@PathVariable Long id) {
        return clientService.getClient(id);
    }

    @PostMapping("")
    @ResponseStatus(code = HttpStatus.CREATED)
    public ClientResponseDTO addClient(@RequestBody ClientRequestDTO client) {
        return clientService.addClient(client);
    }

    @PutMapping("/{id}")
    public ClientResponseDTO updateClient(@PathVariable Long id, @RequestBody ClientRequestDTO client) {
        return clientService.updateClient(id, client);
    }

    @DeleteMapping("/{id}")
    public void deleteClient(@PathVariable Long id) {
        clientService.deleteClient(id);
    }

    @PostMapping("/{id}/accounts")
    @ResponseStatus(code = HttpStatus.CREATED)
    public AccountResponseDTO addAccount(@PathVariable(name = "id") Long clientId, @RequestBody AccountRequestDTO accountRequestDTO) {
        return accountService.addAccount(accountRequestDTO, clientId);
    }

    @GetMapping("/{id}/accounts")
    public List<AccountResponseDTO> getAccountsByClient(@PathVariable(name = "id") Long id) {
        return accountService.getAccountsByClient(id);
    }

    @PostMapping("/{id}/addresses")
    @ResponseStatus(code = HttpStatus.CREATED)
    public AddressResponseDTO addAddress(@PathVariable(name = "id") Long clientId, @RequestBody AddressRequestDTO addressRequestDTO) {
        return addressService.addAddress(addressRequestDTO, clientId);
    }

    @GetMapping("/{id}/addresses")
    public List<AddressResponseDTO> getAddressesByClient(@PathVariable(name = "id") Long id) {
        return addressService.getAddressesByClient(id);
    }
    //!!!!
    @GetMapping(value="/{id}/adresses")
    public List<AddressResponseDTO> getAdressesByClient(@PathVariable(name = "id") Long id){
        return clientService.getClient(id).getAddresses();
    }

}
