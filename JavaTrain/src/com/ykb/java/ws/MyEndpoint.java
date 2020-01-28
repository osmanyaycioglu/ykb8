package com.ykb.java.ws;

import javax.xml.ws.Endpoint;

public class MyEndpoint {
	public static void main(final String[] args) {
		Endpoint.publish("http://127.0.0.1:8090/test", new MyWebService());
	}
}
