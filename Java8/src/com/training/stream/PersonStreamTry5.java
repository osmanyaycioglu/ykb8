package com.training.stream;

import java.nio.charset.Charset;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.HashMap;
import java.util.Map;

public class PersonStreamTry5 {
    private Map<String, CounterHolder> counterMap = new HashMap<>();

    public static class CounterHolder {
        private int counter = 1;

        public void increase() {
            this.counter++;
        }

        public int getCounter() {
            return this.counter;
        }

        @Override
        public String toString() {
            return "counter=" + this.counter;
        }

    }

    public static void main(final String[] args) throws Exception {

        PersonStreamTry5 pt5 = new PersonStreamTry5();

        Files.readAllLines(Paths.get("persons.txt"),
                           Charset.defaultCharset())
             .stream()
             .map(PersonStreamTry1::process)
             .map(Person::getHobbies)
             .flatMap(t -> t.stream())
             .forEach(pt5::pro);

        pt5.counterMap.entrySet()
                      .stream()
                      .forEach(System.out::println);
    }

    public void pro(final String s) {
        CounterHolder ch = this.counterMap.get(s);
        if (ch != null) {
            ch.increase();

        } else {
            this.counterMap.put(s,
                                new CounterHolder());
        }
    }
}
