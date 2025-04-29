package com.training.service;

import org.springframework.kafka.annotation.KafkaListener;
import org.springframework.stereotype.Service;

@Service
public class WelcomeConsumer {

	@KafkaListener(topics = "Welcome1-Topic", groupId = "MyGroup")
	public void receive(String p) {
		System.out.println("The String message is consumed here");
		System.out.println(p);

	}

}
