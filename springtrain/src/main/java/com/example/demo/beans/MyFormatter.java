package com.example.demo.beans;

import org.springframework.stereotype.Component;

@Component
public class MyFormatter {
	
	public String format(String str) {
		return str + " formatted";
	}
}
