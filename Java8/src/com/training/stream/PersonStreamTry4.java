package com.training.stream;

import java.nio.charset.Charset;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.HashSet;
import java.util.Set;
import java.util.stream.Collectors;

public class PersonStreamTry4 {
    public static void main(final String[] args) throws Exception {
        Set<String> hobbies = new HashSet<>();

        Files.readAllLines(Paths.get("persons.txt"),
                           Charset.defaultCharset())
             .stream()
             .map(PersonStreamTry1::process)
             .sorted((p1, p2) -> p1.getAge() - p2.getAge())
             .limit(3)
             .collect(Collectors.toList())
             .forEach(System.out::println);
    }
}
