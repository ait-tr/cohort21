package de.aittr.bd1.repository;

import de.aittr.bd1.entity.Address;
import de.aittr.bd1.entity.Client;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface AddressRepository extends JpaRepository<Address, Long> {
}
