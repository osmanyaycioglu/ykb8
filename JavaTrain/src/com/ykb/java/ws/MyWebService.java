package com.ykb.java.ws;

import javax.jws.WebService;

@WebService
public class MyWebService {

	public String hello() {
		return "hello world";
	}

}
