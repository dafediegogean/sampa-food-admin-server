package br.com.sampafood.admin.server;

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
