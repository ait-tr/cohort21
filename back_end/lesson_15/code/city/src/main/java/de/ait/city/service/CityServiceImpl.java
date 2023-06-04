package de.ait.city.service;

import de.ait.city.dto.CityRequestDTO;
import de.ait.city.dto.CityResponseDTO;
import de.ait.city.entity.City;
import de.ait.city.repository.CityRepository;
import lombok.AllArgsConstructor;
import org.modelmapper.ModelMapper;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@AllArgsConstructor
@Service
public class CityServiceImpl {
    private CityRepository repository;
    private  ModelMapper mapper;




    public List<CityResponseDTO> getAllCities(){
        List<CityResponseDTO> list = new ArrayList<>();

        repository.findAll().forEach(
                c->{
                    CityResponseDTO cdto = new CityResponseDTO(
                            c.getId(),
                            c.getName(),
                            c.getCountry(),
                            c.getPopulation(),
                            c.getArea()
                            );

                    list.add(cdto);
                }
        );
        return list;
    }


    public CityResponseDTO addCity(CityRequestDTO city){
        City resCityEntity = repository.save(mapper.map(city, City.class)); // RequestDTO -> entity
        return  mapper.map(resCityEntity, CityResponseDTO.class); // entity -> ResponseDTO
    }

    public CityResponseDTO updateCity(Long id, CityRequestDTO city){
        City entity = mapper.map(city, City.class);
        entity.setId(id);
        City resEntity = repository.save(entity);
        return mapper.map(resEntity,CityResponseDTO.class);
    }

    public CityResponseDTO updateUser(Long id, CityRequestDTO cityDTO) {
        if (repository.existsById(id)) {
            City existingCity = repository.findById(id).get();
            mapper.getConfiguration().setSkipNullEnabled(true);
            mapper.map(cityDTO, existingCity); // новый объект НЕ создаём
            // user.setId(id); // сеттер ID нам тут больше не нужен, так как мы уже нашли User и проапдейтили нужные значения
            repository.save(existingCity);
            mapper.getConfiguration().setSkipNullEnabled(false);
            return mapper.map(existingCity, CityResponseDTO.class);
        }
        return null; // тут логичнее вернуть boolean -> false (информацию о неудачном обновлении)
    }


}
