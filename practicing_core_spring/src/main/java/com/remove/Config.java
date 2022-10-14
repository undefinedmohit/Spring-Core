package com.remove;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

@Configuration
@ComponentScan(basePackages = "com.remove")
public class Config {

	@Bean
	public Charger getCharger() {
		Charger x = new Charger();
		return x;
	}

}
