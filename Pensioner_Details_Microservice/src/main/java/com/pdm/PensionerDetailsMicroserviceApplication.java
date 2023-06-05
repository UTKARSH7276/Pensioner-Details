package com.pdm;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@SpringBootApplication
@RestController
public class PensionerDetailsMicroserviceApplication {
	
	//@GetMapping("/hello")
	//public String hello() {
		//return "Hello this is spring";
	//}

	public static void main(String[] args) {
		SpringApplication.run(PensionerDetailsMicroserviceApplication.class, args);
	}

}
