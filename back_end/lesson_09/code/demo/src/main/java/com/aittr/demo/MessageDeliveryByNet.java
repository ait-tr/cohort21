package com.aittr.demo;

import org.springframework.stereotype.Component;

@Component
public class MessageDeliveryByNet implements DeliveryService {
    private Connection connection;

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
