package com.example.webservice3;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.actuate.endpoint.web.annotation.RestControllerEndpoint;
import org.springframework.cloud.client.ServiceInstance;
import org.springframework.cloud.loadbalancer.annotation.LoadBalancerClient;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;


@RestController
public class Microervice3 {
	@Autowired
	private LoadBalancerClient loadBalancer;
	@GetMapping("/")
	public void method() {
	ServiceInstance serviceInstance = loadBalancer.choose("name-of-the- microservice1");
	System.out.println(serviceInstance.getUri());
	       }
}
