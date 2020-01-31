package com.training.stream;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class StreamTry1 {
	public static void main(final String[] args) {
		List<Integer> asList = Arrays.asList(10, 20, 30, 40);
		List<String> strList = new ArrayList<>();
		for (Integer integer : asList) {
			if (integer > 20) {
				System.out.println(integer);
				strList.add(integer + " işlendi");

			}
		}

		List<String> strList2 = new ArrayList<>();
		asList.forEach(o -> {
			if (o > 20) {
				System.out.println(o);
				strList2.add(o + " işlendi");
			}
		});

		List<String> collect = asList.stream().filter(h -> h > 20).peek(System.out::println)
				.map(g -> g + " işlendi stream").collect(Collectors.toList());
		System.out.println(collect);

		List<String> asList2 = Arrays.asList("osman", "ali", "veli", "Ayse");
		Stream.of("osman", "ali", "veli", "Ayse");
		List<Integer> collect2 = asList2.stream().map(r -> r.length())
				// .map(String::length)
				.collect(Collectors.toList());

	}
}
