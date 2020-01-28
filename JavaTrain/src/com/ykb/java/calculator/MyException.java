package com.ykb.java.calculator;

public class MyException extends Exception {

	private String str;

	public MyException(final String str) {
		this.setStr(str);
	}

	public String getStr() {
		return this.str;
	}

	public void setStr(final String str) {
		this.str = str;
	}

}
