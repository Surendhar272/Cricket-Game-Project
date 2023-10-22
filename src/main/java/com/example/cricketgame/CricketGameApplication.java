package com.example.cricketgame;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;
import org.springframework.web.client.RestTemplate;

@SpringBootApplication
public class CricketGameApplication {
	public static void main(String[] args) {
		SpringApplication.run(CricketGameApplication.class, args);
		RestTemplate restTemplate = new RestTemplate();
		restTemplate.put("http://localhost:8083/playMatch", null);
	}

	@Bean
	public RestTemplate getRestTemplate() {
		return new RestTemplate();
	}
}
