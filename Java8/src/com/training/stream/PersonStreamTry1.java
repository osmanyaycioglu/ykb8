package com.training.stream;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class PersonStreamTry1 {
	public static void main(final String[] args) {
		String string = "osman,yaycioglu,50,200,BASKETBOL:CODING:TEACHING#" + "ayse,yaycioglu,20,200,DANS:VOLEYBOL";
		Stream<String> lines = Stream.of(string.split("#"));
		List<Person> personList = lines.map(PersonStreamTry1::process).collect(Collectors.toList());
	}

	public static Person process(final String g) {
		Person person = new Person();
		String[] split = g.split(",");
		person.setName(split[0]);
		person.setSurname(split[1]);
		person.setAge(Integer.parseInt(split[2]));
		person.setHeight(Integer.parseInt(split[3]));
		person.setHobbies(Arrays.asList(split[4].split(":")));
		return person;

	}
}
