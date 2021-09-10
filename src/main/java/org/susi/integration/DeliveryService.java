package org.susi.integration;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;
import org.springframework.integration.http.config.EnableIntegrationGraphController;

@EnableDiscoveryClient
@SpringBootApplication
@EnableIntegrationGraphController(allowedOrigins = "*")
public class DeliveryService {

	
	public static void main(String[] args) {
		SpringApplication.run(DeliveryService.class, args);
	}
}

