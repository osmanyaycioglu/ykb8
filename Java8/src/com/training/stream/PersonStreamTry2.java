package com.training.stream;

import java.nio.charset.Charset;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.HashSet;
import java.util.Set;

public class PersonStreamTry2 {
    public static void main(final String[] args) throws Exception {
        Set<String> hobbies = new HashSet<>();

        Files.readAllLines(Paths.get("persons.txt"),
                           Charset.defaultCharset())
             .stream()
             .map(PersonStreamTry1::process)
             .filter(p -> p.getHeight() > 120)
             .forEach(o -> hobbies.addAll(o.getHobbies()));
        System.out.println(hobbies);
    }
}
