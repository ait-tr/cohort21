package com.aittr.demo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;
import org.springframework.context.ConfigurableApplicationContext;

@SpringBootApplication
public class DemoApplication {

	public static void main(String[] args) {
		ConfigurableApplicationContext context= SpringApplication.run(DemoApplication.class, args); // IoC

		// TTConnection -> "TTConnection"
		//Connection connection = (Connection) context.getBean("tcpConnection");
		//Connection connection = (Connection) context.getBean("tcp");
		//DeliveryService deliveryService = (DeliveryService) context.getBean("messageDeliveryByNet");
		//Messenger messenger = (Messenger)context.getBean("messenger");
		Messenger messenger = context.getBean(Messenger.class);
		messenger.sendMessage("hello message");
	}

}
