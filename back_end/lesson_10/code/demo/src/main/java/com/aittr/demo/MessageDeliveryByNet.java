package com.aittr.demo;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

@Component
public class MessageDeliveryByNet implements DeliveryService {
    private Connection connection;
    /*
    @Autowired
    public MessageDeliveryByNet(@Qualifier("udp") Connection connection,
                                @Qualifier("udp") Connection connection1) {
        this.connection = connection;
        System.out.println(connection);
        connection.init();
        System.out.println(connection1);
        connection1.init();
    }

     */


    @Autowired
        public MessageDeliveryByNet(Connection connection) {
        this.connection = connection;
    }
    public void deliveryMessage(){
        System.out.println("internet sending");
        connection.init();
        connection.send();
        connection.close();
        System.out.println("the message delivered");


    }
}
