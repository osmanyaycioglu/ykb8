package com.training.stream;

import java.nio.charset.Charset;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.IntSummaryStatistics;

public class PersonStreamTry8 {
    public static void main(final String[] args) throws Exception {

        IntSummaryStatistics summaryStatistics = Files.readAllLines(Paths.get("persons.txt"),
                                                                    Charset.defaultCharset())
                                                      .stream()
                                                      .map(PersonStreamTry1::process)
                                                      .filter(p -> p.getHeight() > 120)
                                                      .mapToInt(Person::getHeight)
                                                      .summaryStatistics();
        System.out.println(summaryStatistics);
    }
}
