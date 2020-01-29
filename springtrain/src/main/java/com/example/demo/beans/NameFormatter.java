package com.example.demo.beans;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class NameFormatter implements IFormatter{
	
	@Autowired
	private MyFormatter mf;
	
	public String format(String str) {
		return "name formatted : " + mf.format(str);
	}
	
}
