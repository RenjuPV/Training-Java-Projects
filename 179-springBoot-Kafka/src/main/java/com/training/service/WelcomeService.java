package com.training.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.kafka.core.KafkaTemplate;
import org.springframework.stereotype.Service;

@Service
public class WelcomeService {

	@Autowired
	KafkaTemplate<String, String> template;

	public void sendToKafka(String s) {

		template.send("Welcome1-Topic", s);
		System.out.println(s + " send to kafka");

	}

}
