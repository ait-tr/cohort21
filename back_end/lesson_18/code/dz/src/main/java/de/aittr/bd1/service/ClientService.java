package de.aittr.bd1.service;

import de.aittr.bd1.dto.ClientRequestDTO;
import de.aittr.bd1.dto.ClientResponseDTO;
import de.aittr.bd1.entity.Client;

import java.util.List;

public interface ClientService {
    List<ClientResponseDTO> getList();
    ClientResponseDTO getClient(Long id);
    ClientResponseDTO addClient(ClientRequestDTO client);
    ClientResponseDTO updateClient(Long id, ClientRequestDTO client);
    void deleteClient(Long id);


}
