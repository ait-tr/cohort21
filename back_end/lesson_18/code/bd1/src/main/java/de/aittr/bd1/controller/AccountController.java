package de.aittr.bd1.controller;

import de.aittr.bd1.dto.AccountRequestDTO;
import de.aittr.bd1.dto.AccountResponseDTO;

import de.aittr.bd1.service.AccountService;
import lombok.RequiredArgsConstructor;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.*;

import java.util.List;


@RestController
@RequiredArgsConstructor
@RequestMapping("accounts")
public class AccountController {
    private final AccountService service;

    @GetMapping(name="")
    public List<AccountResponseDTO> getList(){
        return service.getList();
    }

    @GetMapping("/{id}")
    public AccountResponseDTO getAccount(@PathVariable(name = "id") Long id){
        return service.getAccount(id);
    }
/*
    @PostMapping(name="")
    @ResponseStatus(code= HttpStatus.CREATED)
    public AccountResponseDTO addAccount(@RequestBody AccountRequestDTO account){
        return service.addAccount(account);
    }
*/
    @PutMapping(name="/{id}")
    public AccountResponseDTO addAccount(@PathVariable(name="id") Long id, @RequestBody AccountRequestDTO client){
        return service.updateAccount(id,client);
    }

    @DeleteMapping(name="/{id}")
    public void add1Account(@PathVariable(name="id") Long id){
        service.deleteAccount(id);
    }

    // POST accounts/2/clients/1     client(id 1) added to acc(id 2)
    @PostMapping(value="/{accountId}/clients/{clientId}")
    public void addClientToAccount(@PathVariable(name="accountId") Long accountId,
                           @PathVariable(name="clientId") Long clientId){
        service.addClientToAccount(accountId, clientId);
    }

}
