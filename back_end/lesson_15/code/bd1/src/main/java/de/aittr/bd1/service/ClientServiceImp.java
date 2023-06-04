package de.aittr.bd1.service;

import de.aittr.bd1.dto.AccountResponseDTO;
import de.aittr.bd1.dto.ClientRequestDTO;
import de.aittr.bd1.dto.ClientResponseDTO;
import de.aittr.bd1.entity.Account;
import de.aittr.bd1.entity.Client;
import lombok.RequiredArgsConstructor;
import org.modelmapper.ModelMapper;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.stream.Collectors;

@Service
@RequiredArgsConstructor

public class ClientServiceImp implements ClientService{
    private final JpaRepository<Client, Long> clientRepository;
    private final ModelMapper mapper;

    @Override
    public List<ClientResponseDTO> getList() {
        List<Client> clients = clientRepository.findAll();
        return clients.stream()
                .map(a->mapper.map(a, ClientResponseDTO.class))
                .collect(Collectors.toList());
    }

    @Override
    public ClientResponseDTO getClient(Long id) {
        return mapper.map(clientRepository.findById(id), ClientResponseDTO.class);
    }

    @Override
    public ClientResponseDTO addClient(ClientRequestDTO client) {
        Client entity = mapper.map(client, Client.class);
        return mapper.map(clientRepository.save(entity), ClientResponseDTO.class);
    }

    @Override
    public ClientResponseDTO updateClient(Long id, ClientRequestDTO client) {
        if (clientRepository.existsById(id)) {
            Client entity = mapper.map(client, Client.class);
            entity.setId(id);
            return mapper.map(clientRepository.save(entity), ClientResponseDTO.class);
        }
        return null;
    }

    @Override
    public void deleteClient(Long id) {
        clientRepository.deleteById(id);
    }
}
