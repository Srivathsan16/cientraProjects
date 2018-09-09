package com.cientra.solutions.cientraProjects;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import static org.springframework.boot.SpringApplication.*;

@SpringBootApplication
@EnableAutoConfiguration
public class CientraProjectsApplication {

	public static void main(String[] args) {
		SpringApplication.run(CientraProjectsApplication.class,args);

		/*SpringApplication.run(CientraProjectsApplication.class, args);*/
	}
}
