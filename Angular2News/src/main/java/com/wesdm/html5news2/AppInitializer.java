package com.wesdm.html5news2;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

@Configuration
@EnableAutoConfiguration
//@ComponentScan("com.wesdm.html5news2")
public class AppInitializer {
	public static void main(String[] args) {
		SpringApplication.run(AppInitializer.class, args);
	}
}
