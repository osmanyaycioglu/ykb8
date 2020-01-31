package com.training.stream;

import java.nio.charset.Charset;
import java.nio.file.Files;
import java.nio.file.Paths;

public class PersonStreamTry7 {
    public static void main(final String[] args) throws Exception {

        Person reduce = Files.readAllLines(Paths.get("persons.txt"),
                                           Charset.defaultCharset())
                             .stream()
                             .map(PersonStreamTry1::process)
                             .filter(p -> p.getHeight() > 120)
                             .reduce(new Person(),
                                     (t, e) -> {
                                         t.setHeight(t.getHeight() + e.getHeight());
                                         return t;
                                     });
        System.out.println(reduce);
    }
}
