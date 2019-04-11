package com.mintex;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.CrossOrigin;

@SpringBootApplication
@CrossOrigin
public class MintexUserMicroserviceApplication {

	public static void main(String[] args) {
		SpringApplication.run(MintexUserMicroserviceApplication.class, args);
		System.out.println("started");
	}

}
