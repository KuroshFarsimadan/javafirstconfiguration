package com.pluralsight.javafirstconfiguration;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.builder.SpringApplicationBuilder;
import org.springframework.boot.web.servlet.support.SpringBootServletInitializer;

@SpringBootApplication
public class JavaFirstConfigurationApplication extends SpringBootServletInitializer {

	public static void main(String[] args) {
		SpringApplication.run(JavaFirstConfigurationApplication.class, args);
	}

}
