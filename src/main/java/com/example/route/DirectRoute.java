package com.example.route;

import org.apache.camel.ProducerTemplate;
import org.apache.camel.spring.Main;

import com.example.message.Message;

public class DirectRoute {
	
	public static void main(String[] args) throws Exception {
		Main camel = new Main();
		camel.setApplicationContextUri("config/direct.xml");
		camel.start();

		ProducerTemplate producer = camel.getCamelTemplate();
		Message message = new Message();
		//		producer.sendBody("direct:naver", "Hello World!");
		producer.sendBody("direct:naver", message);

		camel.stop();
	}
}
