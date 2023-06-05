package de.aittr.bd1.service;

import de.aittr.bd1.dto.AccountRequestDTO;
import de.aittr.bd1.dto.AccountResponseDTO;

import java.util.List;

public interface AccountService {
    List<AccountResponseDTO> getList();
    AccountResponseDTO getAccount(Long id);
    AccountResponseDTO addAccount(AccountRequestDTO account);
    AccountResponseDTO updateAccount(Long id, AccountRequestDTO account);
    void deleteAccount(Long id);


}
