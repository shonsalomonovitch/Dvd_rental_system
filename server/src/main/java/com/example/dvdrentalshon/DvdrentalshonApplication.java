package com.example.dvdrentalshon;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;
import io.github.cdimascio.dotenv.Dotenv;


@SpringBootApplication
public class DvdrentalshonApplication {

	public static void main(String[] args) {
		// Load the .env file
		Dotenv dotenv = Dotenv.load();

		// Set System properties (optional)
		System.setProperty("DB_PASSWORD", dotenv.get("DB_PASSWORD"));
		System.setProperty("DB_USERNAME", dotenv.get("DB_USERNAME"));

		SpringApplication.run(DvdrentalshonApplication.class, args);
	}

}
