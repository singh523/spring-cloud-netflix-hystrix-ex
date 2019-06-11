package com.springboot.netflix.example.springnetflix;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.openfeign.EnableFeignClients;

@SpringBootApplication
@EnableFeignClients
public class SpringNetflixApplication {

	public static void main(String[] args) {
		SpringApplication.run(SpringNetflixApplication.class, args);
	}

}
