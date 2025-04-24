package com.training.ui;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.boot.web.client.RestTemplateBuilder;
import org.springframework.context.annotation.Lazy;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

import com.netflix.appinfo.InstanceInfo;
import com.netflix.discovery.EurekaClient;

@RestController
public class EmployeeInvokerController {

	@Autowired
	@Lazy
	private EurekaClient eurekaClient;
	
	@Value("${spring.application.name}")
	private String appName;
	
	@Autowired
	private RestTemplateBuilder builder;
	
	@GetMapping("/invokeEmployeeList")
	public String f1() {
		RestTemplate template=builder.build();
		InstanceInfo instanceInfo = eurekaClient.getNextServerFromEureka("169-SpringBoot-Eureka-Employee-Service", false);
		String baseUrl=instanceInfo.getHomePageUrl();
		
		String result=template.getForObject(baseUrl+"/fetchEmpList", String.class);
	
		return result;
	}
	
	@GetMapping("/invokeEmployees")
	public ResponseEntity<List> f2() {
		RestTemplate template=builder.build();
		InstanceInfo instanceInfo = eurekaClient.getNextServerFromEureka("169-SpringBoot-Eureka-Employee-Service", false);
		String baseUrl=instanceInfo.getHomePageUrl();
		
		ResponseEntity<List> result= template.getForEntity(baseUrl+"/fetchEmpList", List.class);
	
		return result;
	}
	
}

