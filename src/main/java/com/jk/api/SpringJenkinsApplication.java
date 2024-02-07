package com.jk.api;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import jakarta.annotation.PostConstruct;

@SpringBootApplication
@RestController
public class SpringJenkinsApplication {

	public static Logger logger = LoggerFactory.getLogger(SpringJenkinsApplication.class);

	@PostConstruct
	public /*void*/ init() {
		logger.info("Application started.. ");
		logger.info("******** second logger statement ***************************");
	}

	@GetMapping("/app")
	public String display() {

		return "this is my first jenkin deployment";
	}

	public static void main(String[] args) {
		logger.info("Application executed ..");
		SpringApplication.run(SpringJenkinsApplication.class, args);
	}

}
