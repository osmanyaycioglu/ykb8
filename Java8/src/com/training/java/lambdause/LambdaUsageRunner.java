package com.training.java.lambdause;

import java.util.Arrays;
import java.util.List;
import java.util.function.Function;

public class LambdaUsageRunner {

	public static void main(final String[] args) {
		List<String> strList = Arrays.asList("osman", "ali", "veli");
		LambdaUsageRunner.showStringList(strList, s -> s + " test");
		LambdaUsageRunner.showStringList(strList, s -> "sayin " + s);
		List<Integer> iList = Arrays.asList(1, 3, 5, 8, 9, 11, 22);
		LambdaUsageRunner.processIntList(iList, u -> u + 5);

		LambdaUsageRunner.processIntList(iList, u -> u + 10);
	}

	public static void showStringList(final List<String> strList, final Function<String, String> f) {
		int index = 0;
		for (String string : strList) {
			String a = f.apply(string);
			System.out.println("Index : " + index + " value : " + a);
			index++;
		}

	}

	public static void processIntList(final List<Integer> intList, final Function<Integer, Integer> f) {
		int index = 0;
		for (Integer iVal : intList) {
			Integer a = f.apply(iVal);
			System.out.println("Index : " + index + " value : " + a);
			index++;
		}

	}
}
