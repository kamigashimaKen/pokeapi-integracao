package com;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.openfeign.EnableFeignClients;

@SpringBootApplication
@EnableFeignClients
public class PokemonIntegracaoApplication {

	public static void main(String[] args) {
		SpringApplication.run(PokemonIntegracaoApplication.class, args);
	}

}
