package com.training.java;

import java.util.function.Consumer;

public class ConsumerRun {
	public static void main(final String[] args) {
		Consumer<String> con = s -> System.out.println(s);
		Consumer<String> con2 = System.out::println;

		con.andThen(d -> System.out.println("Second " + d)).andThen(e -> System.out.println("third " + e))
				.accept("test");
	}
}
