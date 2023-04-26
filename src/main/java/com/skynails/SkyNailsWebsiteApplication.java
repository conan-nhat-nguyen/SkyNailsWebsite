package com.skynails;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import com.skynails.controller.AppointmentController;

@SpringBootApplication
@RestController
public class SkyNailsWebsiteApplication {

	public static void main(String[] args) {
		SpringApplication.run(SkyNailsWebsiteApplication.class, args);
		
	}
	
	@GetMapping("/root")
	public String apiRoot() {
		return "Hello World";
	}

}
