package com.training.java.mr;

import java.util.Scanner;
import java.util.function.BiFunction;

public class RunnerMR {
	public static void main(final String[] args) {

		try (Scanner sc = new Scanner(System.in)) {
			System.out.println("Seçiminiz : ");
			int nextInt = sc.nextInt();
			BiFunction<String, String, String> mp = null;
			switch (nextInt) {
			case 1:
				mp = (s, k) -> s + " " + k;
				break;
			case 2:
				mp = (s, k) -> "sayın " + s + " " + k;
				break;
			case 3:
				mp = RunnerMR::myMethod;
				break;

			default:
				mp = (s, k) -> s;
				break;
			}

			String abc = mp.apply("my", "first");
			System.out.println(abc);
		}
	}

	public static String myMethod(String s, final String k) {
		if (s == null) {
			s = "";
		}
		return "paşa hazretleri " + s + " " + k;

	}
}
