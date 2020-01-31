package com.training.java;

public class AnonymousClass {
	public static void main(final String[] args) {

		int a = 100;
		IAnyIntf anyIntf = new IAnyIntf() {
			@Override
			public void proccess(final String process) {
				System.out.println(process + " " + a);
			}
		};

		anyIntf.proccess("test");
	}
}
