package com.example.demo.aop;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

@Component
public class CommandRun implements CommandLineRunner{

	@Autowired
	private Caller caller;
	@Override
	public void run(String... args) throws Exception {
		caller.call();
		
	}

}
