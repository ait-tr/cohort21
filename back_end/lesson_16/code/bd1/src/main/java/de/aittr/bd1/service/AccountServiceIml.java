package de.aittr.bd1.service;

import de.aittr.bd1.dto.AccountRequestDTO;
import de.aittr.bd1.dto.AccountResponseDTO;
import de.aittr.bd1.dto.ClientResponseDTO;
import de.aittr.bd1.entity.Account;
import de.aittr.bd1.entity.Client;
import lombok.AllArgsConstructor;
import lombok.RequiredArgsConstructor;
import org.modelmapper.ModelMapper;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.stream.Collectors;

@Service
@RequiredArgsConstructor
public class AccountServiceIml implements AccountService{
    private final JpaRepository<Account, Long> accountRepository;
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
    public AccountResponseDTO addAccount(AccountRequestDTO account) {
        Account entity = mapper.map(account, Account.class);
        return mapper.map(accountRepository.save(entity),AccountResponseDTO.class);
    }

    @Override
    public AccountResponseDTO updateAccount(Long id, AccountRequestDTO account) {
        if (accountRepository.existsById(id)) {
            Account entity = mapper.map(account, Account.class);
            entity.setId(id);
            return mapper.map(accountRepository.save(entity), AccountResponseDTO.class);
        }
        return null;

    }

    @Override
    public void deleteAccount(Long id) {
        accountRepository.deleteById(id);
    }
}
