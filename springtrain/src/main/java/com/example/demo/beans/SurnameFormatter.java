package com.example.demo.beans;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class SurnameFormatter implements IFormatter{
	
	@Autowired
	private MyFormatter mf;
	
	public String format(String str) {
		return "surname formatted : " + mf.format(str);
	}
	
}
