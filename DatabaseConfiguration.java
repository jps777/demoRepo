package com.example.demo.configuration;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import springfox.documentation.swagger2.annotations.EnableSwagger2;

@EnableSwagger2
@Configuration
public class DatabaseConfiguration {
	
	@Bean
	public void connectH2Database( ) {
		
	}
	
	@Bean
	public void connectOracleDatabase() {
		
	}

}
