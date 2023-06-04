package de.ait.city.configuration;

import de.ait.city.dto.CityRequestDTO;
import de.ait.city.entity.City;
import jakarta.websocket.Decoder;
import org.modelmapper.ModelMapper;
import org.modelmapper.TypeMap;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import java.util.Base64;


@Configuration
public class AppConfiguration {
    @Bean
    public ModelMapper getMapper(){
        ModelMapper mapper = new ModelMapper();
        TypeMap<CityRequestDTO, City> propertyMapper1 = mapper.createTypeMap(CityRequestDTO.class, City.class);
        propertyMapper1.addMapping(CityRequestDTO::getCityName, City::setName);

        return mapper;
    }

/*    @Bean
    public Base64.Decoder getDecoder(){

        return new Base64.Decoder();
    }*/

}
