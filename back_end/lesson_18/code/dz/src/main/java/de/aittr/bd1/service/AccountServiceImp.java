package de.aittr.bd1.service;

import de.aittr.bd1.dto.AccountRequestDTO;
import de.aittr.bd1.dto.AccountResponseDTO;
import de.aittr.bd1.entity.Account;
import de.aittr.bd1.entity.Client;
import lombok.RequiredArgsConstructor;
import org.modelmapper.ModelMapper;
import org.modelmapper.TypeToken;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.stream.Collectors;

@Service
@RequiredArgsConstructor
public class AccountServiceImp implements AccountService{
    private final JpaRepository<Account, Long> accountRepository;
    private final JpaRepository<Client, Long> clientRepository;
    private final ModelMapper mapper;

    @Override
    public List<AccountResponseDTO> getList() {
        List<Account> accounts = accountRepository.findAll();
        return accounts.stream()
                .map(a->mapper.map(a, AccountResponseDTO.class))
                .collect(Collectors.toList());
    }

    @Override
    public AccountResponseDTO getAccount(Long id) {
        return mapper.map(accountRepository.findById(id), AccountResponseDTO.class);
    }

    @Override
    public AccountResponseDTO addAccount(AccountRequestDTO accountRequestDTO) {
        Account entity = mapper.map(accountRequestDTO, Account.class);
        return mapper.map(accountRepository.save(entity),AccountResponseDTO.class);
    }

    @Override
    public AccountResponseDTO updateAccount(Long id, AccountRequestDTO accountRequestDTO) {
        if (accountRepository.existsById(id)) {
            Account entity = mapper.map(accountRequestDTO, Account.class);
            entity.setId(id);
            return mapper.map(accountRepository.save(entity), AccountResponseDTO.class);
        }
        return null;

    }

    @Override
    public void deleteAccount(Long id) {
        accountRepository.deleteById(id);
    }

    @Override
    public AccountResponseDTO addAccount(AccountRequestDTO accountRequestDTO, Long clientId) {
        Account entity = mapper.map(accountRequestDTO, Account.class);
        Client client = clientRepository.findById(clientId).get();
        entity.setClient(client);
        client.getAccounts().add(entity);
        Account savedAccount = accountRepository.save(entity);
        return mapper.map(savedAccount, AccountResponseDTO.class);
    }

    @Override
    public List<AccountResponseDTO> getAccountsByClient(Long id) {
        Client client = clientRepository.findById(id).get();
        List<Account> accountsByClient = client.getAccounts();
        return mapper.map(accountsByClient, new TypeToken<List<AccountRequestDTO>>(){}.getType());
    }
}
