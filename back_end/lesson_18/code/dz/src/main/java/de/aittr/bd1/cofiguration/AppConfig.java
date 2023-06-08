package de.aittr.bd1.cofiguration;

import de.aittr.bd1.dto.ClientRequestDTO;
import de.aittr.bd1.entity.Client;
import org.modelmapper.ModelMapper;
import org.modelmapper.TypeMap;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class AppConfig {

    @Bean
    public ModelMapper getMapper(){
        ModelMapper mapper = new ModelMapper();
        TypeMap<ClientRequestDTO, Client> clientToEntity = mapper.createTypeMap(ClientRequestDTO.class, Client.class);
        clientToEntity.setPostConverter(d -> {
            Client client = d.getDestination();
            //client.getAccount().setClient(client);
            //client.getAddress().setClient(client);
            return client;
        });
        return mapper;
    }
}
