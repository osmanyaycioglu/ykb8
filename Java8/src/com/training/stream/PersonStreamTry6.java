package com.training.stream;

import java.nio.charset.Charset;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.function.Function;
import java.util.stream.Collectors;

public class PersonStreamTry6 {

    public static void main(final String[] args) throws Exception {

        Files.readAllLines(Paths.get("persons.txt"),
                           Charset.defaultCharset())
             .parallelStream()
             .map(PersonStreamTry1::process)
             .map(Person::getHobbies)
             .flatMap(t -> {
                 System.out.println("Thread name : " + Thread.currentThread()
                                                             .getName());

                 return t.stream();
             })
             .collect(Collectors.groupingBy(Function.identity(),
                                            Collectors.counting()))
             .entrySet()
             .forEach(System.out::println);

    }

}
