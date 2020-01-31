package com.training.stream;

import java.util.List;

public class Person {
    private long id;
    private String name;
    private String surname;
    private int age;
    private int height;
    private List<String> hobbies;

    public String getName() {
        return this.name;
    }

    public void setName(final String name) {
        this.name = name;
    }

    public String getSurname() {
        return this.surname;
    }

    public void setSurname(final String surname) {
        this.surname = surname;
    }

    public int getAge() {
        return this.age;
    }

    public void setAge(final int age) {
        this.age = age;
    }

    public int getHeight() {
        return this.height;
    }

    public void setHeight(final int height) {
        this.height = height;
    }

    public List<String> getHobbies() {
        System.out.println("Thread name : " + Thread.currentThread()
                                                    .getName());

        return this.hobbies;
    }

    public void setHobbies(final List<String> hobbies) {
        this.hobbies = hobbies;
    }

    @Override
    public String toString() {
        return "Person [name=" + this.name + ", surname=" + this.surname + ", age=" + this.age + ", height="
                + this.height + ", hobbies=" + this.hobbies + "]";
    }

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

}
