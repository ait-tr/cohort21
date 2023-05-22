package com.aittr.demo;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class Messenger {
    /*
    Инджектить компоненты можем через
    - конструктор (!!!)
    - метод (сеттер или не сеттер)
    - поле

     */


    @Autowired
    private DeliveryService deliveryService;

    /*@Autowired
    public Messenger(DeliveryService deliveryService) {
        this.deliveryService = deliveryService;
    }*/

    /*
    @Autowired
    public void qwert(DeliveryService deliveryService) {  // название метода е важно, важно аннотация @Autowired
        this.deliveryService = deliveryService;
    }


     */
    public void sendMessage(String msg){
        System.out.println("Send new message: " + msg);
        System.out.println("start sending");
        deliveryService.deliveryMessage();
        System.out.println("ok");


    }
}
