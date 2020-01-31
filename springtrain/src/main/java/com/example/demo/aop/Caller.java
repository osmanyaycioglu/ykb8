package com.example.demo.aop;

import org.springframework.beans.factory.annotation.Autowired;

public class Caller {
	
	@Autowired
	private Callee callee;
	
	public void call() {
		String hello = callee.hello("osman");
		System.out.println(hello);
	}
}
