package de.aittr.bd1.repository;

import de.aittr.bd1.entity.Client;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import java.util.List;
import java.util.Optional;

@Repository
public interface ClientRepository extends JpaRepository<Client,Long> {


    public Client findByAgeEquals(Integer age);

    public List<Client> findAllByAgeEquals(Integer age);

    @Query(value="SELECT c FROM Client c WHERE c.age=:age" )
    List<Client> findAllByAge2(@Param(value="age") Integer age);

}
