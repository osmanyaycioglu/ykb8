package com.example.demo.aop;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.EnableAspectJAutoProxy;

@Configuration
@EnableAspectJAutoProxy
public class AOPConf {
	
	@Bean
	public Callee callee() {
		return new Callee();
	}
	
	
	@Bean
	public Caller clCaller() {
		return new Caller();
	}
}
