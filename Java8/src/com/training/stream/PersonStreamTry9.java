package com.training.stream;

import java.nio.charset.Charset;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class PersonStreamTry9 {

    public static class PersonExtra {
        private long id;
        private String name;

        public long getId() {
            return this.id;
        }

        public void setId(final long id) {
            this.id = id;
        }

        public String getName() {
            return this.name;
        }

        public void setName(final String name) {
            this.name = name;
        }

    }

    public static class PersonJoined {
        private Person person;
        private PersonExtra personExtra;

        public Person getPerson() {
            return this.person;
        }

        public void setPerson(final Person person) {
            this.person = person;
        }

        public PersonExtra getPersonExtra() {
            return this.personExtra;
        }

        public void setPersonExtra(final PersonExtra personExtra) {
            this.personExtra = personExtra;
        }

    }

    public static void main(final String[] args) throws Exception {
        Map<Long, PersonExtra> mapPE = new HashMap<>();
        List<PersonJoined> collect = Files.readAllLines(Paths.get("persons.txt"),
                                                        Charset.defaultCharset())
                                          .stream()
                                          .map(PersonStreamTry1::process)
                                          .map(a -> {
                                              PersonExtra personExtra = mapPE.get(a.getId());
                                              PersonJoined joined = new PersonJoined();
                                              joined.setPerson(a);
                                              joined.setPersonExtra(personExtra);
                                              return joined;
                                          })
                                          .collect(Collectors.toList());
    }
}
