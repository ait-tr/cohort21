package de.ait.city.repository;

import de.ait.city.entity.City;
import org.springframework.data.repository.CrudRepository;

public interface CityRepository extends CrudRepository<City,Long> {
}
