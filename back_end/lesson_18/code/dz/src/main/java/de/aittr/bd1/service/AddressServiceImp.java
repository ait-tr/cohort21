package de.aittr.bd1.service;

import de.aittr.bd1.dto.*;
import de.aittr.bd1.entity.Address;
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
public class AddressServiceImp implements AddressService {
    private final JpaRepository<Address, Long> addressRepository;
    private final JpaRepository<Client, Long> clientRepository;
    private final ModelMapper mapper;

    @Override
    public List<AddressResponseDTO> getList() {
        List<Address> addresses = addressRepository.findAll();
        return addresses.stream()
                .map(a -> mapper.map(a, AddressResponseDTO.class))
                .collect(Collectors.toList());
    }

    @Override
    public AddressResponseDTO getAddress(Long id) {
        return mapper.map(addressRepository.findById(id), AddressResponseDTO.class);
    }

    @Override
    public AddressResponseDTO addAddress(AddressRequestDTO address) {
        Address entity = mapper.map(address, Address.class);
        return mapper.map(addressRepository.save(entity), AddressResponseDTO.class);
    }

    @Override
    public AddressResponseDTO updateAddress(Long id, AddressRequestDTO address) {
        if (addressRepository.existsById(id)) {
            Address entity = mapper.map(address, Address.class);
            entity.setId(id);
            return mapper.map(addressRepository.save(entity), AddressResponseDTO.class);
        }
        return null;
    }

    @Override
    public void deleteAddress(Long id) {
        addressRepository.deleteById(id);
    }

    @Override
    public AddressResponseDTO addAddress(AddressRequestDTO addressRequestDTO, Long clientId) {
        Address entity = mapper.map(addressRequestDTO, Address.class);
        Client client = clientRepository.findById(clientId).get();
        entity.setClient(client);
        client.getAddresses().add(entity);
        Address savedAddress = addressRepository.save(entity);
        return mapper.map(savedAddress, AddressResponseDTO.class);
    }

    @Override
    public List<AddressResponseDTO> getAddressesByClient(Long id) {
        Client client = clientRepository.findById(id).get();
        List<Address> addressesByClient = client.getAddresses();
/*        return addressesByClient
                .stream().map(a -> mapper.map(a, AddressResponseDTO.class))
                .collect(Collectors.toList());
                */
        return mapper.map(addressesByClient, new TypeToken<List<AddressResponseDTO>>(){}.getType());

        // List<Client>  !=   List<ClientDTO>
        //compile:
        // List<Object>               List<Object>
    }
}
