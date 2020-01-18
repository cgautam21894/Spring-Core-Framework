package com.gautam.SpringCoreAnno;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

@Configuration
@ComponentScan(basePackages = "com.gautam.SpringCoreAnno")
public class config {

	/*
	 * @Bean public Samsung getPhone() { return new Samsung(); }
	 * 
	 * @Bean public Microprocessor getMicroprocessor() { return new Snapdragon(); }
	 */
}
