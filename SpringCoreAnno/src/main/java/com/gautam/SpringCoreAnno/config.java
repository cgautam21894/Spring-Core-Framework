package com.gautam.SpringCoreAnno;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class config {

	@Bean
	public Samsung getPhone() {
		return new Samsung();
	}

	@Bean
	public Microprocessor getMicroprocessor() {
		return new Snapdragon();
	}
}
