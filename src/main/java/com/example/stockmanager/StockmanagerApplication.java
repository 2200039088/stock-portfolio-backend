package com.example.stockmanager;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.CrossOrigin;

@SpringBootApplication
@CrossOrigin(origins = "http://localhost:5173")
public class StockmanagerApplication {

	public static void main(String[] args) {
		SpringApplication.run(StockmanagerApplication.class, args);
	}

}
