package com.blessingstone.icscollege;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@SpringBootApplication
@RestController
@RequestMapping("welcome")
public class IcsCollegeApplication {

	public static void main(String[] args) {
		SpringApplication.run(IcsCollegeApplication.class, args);
	}
	
	@GetMapping
	public String welcome()
	{
		return "Welcome to Spring boot Application!";
	}

}
