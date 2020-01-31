package com.training.java.ref;

import java.util.function.Consumer;
import java.util.function.Supplier;

public class RefRunner {
	public static void main(final String[] args) {
		IntHolder i = new IntHolder();
		i.setVal(93);
		int a = 100;
		Consumer<String> c = w -> {
			System.out.println("Gelen : " + w + " number : " + a + " number 2 : " + i.getVal());
		};
		i.setVal(88);
		Supplier<String> s = () -> "osman";
	}
}
