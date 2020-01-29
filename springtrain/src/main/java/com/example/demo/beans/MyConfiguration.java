package com.example.demo.beans;

import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Primary;

@Configuration
public class MyConfiguration {

	@Bean
	@Qualifier("isimformat")
	public NameFormatter nameFormat() {
		return new NameFormatter();
	}
	
	@Bean
	@Qualifier("soyisimformat")
	public SurnameFormatter surnameFormat() {
		return new SurnameFormatter();
	}

}
