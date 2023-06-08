package de.aittr.bd1.service;

import de.aittr.bd1.dto.AccountRequestDTO;
import de.aittr.bd1.dto.AccountResponseDTO;
import de.aittr.bd1.dto.AddressRequestDTO;
import de.aittr.bd1.dto.AddressResponseDTO;

import java.util.List;

public interface AddressService {
    List<AddressResponseDTO> getList();
    AddressResponseDTO getAddress(Long id);
    AddressResponseDTO addAddress(AddressRequestDTO addressRequestDTO);
    AddressResponseDTO updateAddress(Long id, AddressRequestDTO addressRequestDTO);
    void deleteAddress(Long id);
    AddressResponseDTO addAddress(AddressRequestDTO addressRequestDTO, Long clientId);
    List<AddressResponseDTO> getAddressesByClient(Long id);
}
