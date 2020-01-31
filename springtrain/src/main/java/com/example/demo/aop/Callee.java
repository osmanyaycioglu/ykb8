package com.example.demo.aop;

public class Callee {
	
	@MyAnno(str="xyz")
	public String hello(String str) {
		return "Hello " + str;
	}
	
}
