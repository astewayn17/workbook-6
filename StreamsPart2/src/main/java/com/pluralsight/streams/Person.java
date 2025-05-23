package com.pluralsight.streams;

public class Person {

    private String firstName;
    private String lastName;
    private int age;

    public Person(String firstName, String lastName, int age) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.age = age;
    }

    public String getFirstName() { return firstName; }
    public int getAge() { return age; }
    public String getLastName() { return lastName; }

    @Override
    public String toString() {
        return this.firstName + " " + this.lastName + ", Age: " + this.age;
    }
}
