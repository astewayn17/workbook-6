package com.pluralsight;

// Implements the Comparable interface to be able to use the compareTo method
public class Person implements Comparable<Person> {

    private String firstName;
    private String lastName;
    private int age;

    public Person(String firstName, String lastName, int age) {
        this.age = age;
        this.lastName = lastName;
        this.firstName = firstName;
    }



    // This overrides the compareTo method from the Comparable interface and uses it to compare the last names
    @Override
    public int compareTo(Person diffPerson) {
        return this.lastName.compareTo(diffPerson.lastName);
    }

    // Overriding toString to simply print if I wanted
//    @Override
//    public String toString() {
//        return firstName + " " + lastName + ", Age: " + age;
//    }

    // Getters
    public String getLastName() { return lastName; }
    public String getFirstName() { return firstName; }
    public int getAge() { return age; }
}
