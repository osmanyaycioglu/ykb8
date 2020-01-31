package com.training.stream;

import java.nio.charset.Charset;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.HashSet;
import java.util.List;
import java.util.Set;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class PersonStreamTry3 {
    public static void main(final String[] args) throws Exception {
        Set<String> hobbies = new HashSet<>();

        Stream<List<String>> map = Files.readAllLines(Paths.get("persons.txt"),
                                                      Charset.defaultCharset())
                                        .stream()
                                        .map(PersonStreamTry1::process)
                                        .map(Person::getHobbies);

        Stream<String> mapStr = map.flatMap(t -> t.stream());

        mapStr.distinct()
              .collect(Collectors.toList())
              .forEach(System.out::println);
    }
}
