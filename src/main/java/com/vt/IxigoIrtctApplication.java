package com.vt;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;
import org.springframework.web.client.RestTemplate;

@SpringBootApplication
public class IxigoIrtctApplication {

	public static void main(String[] args) {
		SpringApplication.run(IxigoIrtctApplication.class, args);
	}
	
	@Bean
	public RestTemplate restTeamplate() {
		return restTeamplate() ;
		
	}

}
