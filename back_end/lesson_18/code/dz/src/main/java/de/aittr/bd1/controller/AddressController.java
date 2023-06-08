package de.aittr.bd1.controller;

import de.aittr.bd1.dto.AddressRequestDTO;
import de.aittr.bd1.dto.AddressResponseDTO;
import de.aittr.bd1.service.AddressServiceImp;
import lombok.RequiredArgsConstructor;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.*;

import java.util.List;


@RestController
@RequiredArgsConstructor
@RequestMapping("addresses")
public class AddressController {
    private final AddressServiceImp service;

    @GetMapping("")
    public List<AddressResponseDTO> getList() {
        return service.getList();
    }

    @GetMapping("/{id}")
    public AddressResponseDTO getAddress(@PathVariable(name = "id") Long id) {
        return service.getAddress(id);
    }

    @PostMapping("")
    @ResponseStatus(code = HttpStatus.CREATED)
    public AddressResponseDTO addAddress(@RequestBody AddressRequestDTO address) {
        return service.addAddress(address);
    }

    @PutMapping("/{id}")
    public AddressResponseDTO updateAddress(@PathVariable(name = "id") Long id, @RequestBody AddressRequestDTO address) {
        return service.updateAddress(id, address);
    }

    @DeleteMapping("/{id}")
    public void deleteAddress(@PathVariable(name = "id") Long id) {
        service.deleteAddress(id);
    }


}
