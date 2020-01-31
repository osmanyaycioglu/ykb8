package com.training.java;

import java.util.Arrays;
import java.util.List;

public class MyFuncIntfRun {
	public static void main(final String[] args) {
		IMyFuncIntf m = (s, f) -> s + " func " + f;

		List<String> asList = Arrays.asList("osman", "ali", "veli");

		for (String s : asList) {
			System.out.println(s + " func");
		}

		asList.forEach(s -> System.out.println(s + " func"));

		// IMyFuncIntf m1 = new IMyFuncIntf() {
//
//			@Override
//			public String xyz(final String s) {
//				System.out.println(s);
//				return s + " func ";
//			}
//		};

		String xyz = m.xyz("Hello", 10);
		System.out.println(xyz);
	}

}
