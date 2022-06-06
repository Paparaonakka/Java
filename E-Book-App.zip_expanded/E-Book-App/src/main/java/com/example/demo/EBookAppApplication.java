package com.example.demo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.servlet.config.annotation.CorsRegistry;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurer;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurerAdapter;

import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class EBookAppApplication {

	public static void main(String[] args) {
		SpringApplication.run(EBookAppApplication.class, args);
	}

}
