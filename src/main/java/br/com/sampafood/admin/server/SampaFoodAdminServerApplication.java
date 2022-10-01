package br.com.algafood.admin.server.sampafoodadminserver;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import de.codecentric.boot.admin.server.config.EnableAdminServer;

@EnableAdminServer
@SpringBootApplication
public class SampaFoodAdminServerApplication {

	public static void main(String[] args) {
		SpringApplication.run(SampaFoodAdminServerApplication.class, args);
	}

}
