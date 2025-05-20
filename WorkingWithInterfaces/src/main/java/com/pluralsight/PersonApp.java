package com.pluralsight;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class PersonApp {

    public static void main(String[] args) {

        // New Array list to hold person objects
        List<Person> myFamily = new ArrayList<>();

        // Adding the person objects to the array list
        myFamily.add(new Person("Dana", "Wyatt", 63));
        myFamily.add(new Person("Zachary", "Westly", 31));
        myFamily.add(new Person("Elisha", "Aslan", 14));
        myFamily.add(new Person("Ian", "Auston", 16));
        myFamily.add(new Person("Zephaniah", "Hughes", 9));
        myFamily.add(new Person("Ezra", "Aiden", 17));

        // Sort the list based on last name using the compareTo method in the Person class
        Collections.sort(myFamily);

        // For every Person object called human in the getters will print out the names
        for (Person human : myFamily) {
            System.out.println(human.getFirstName() + " " + human.getLastName() + ", Age: " + human.getAge());
        }
        // Uses the optional toString
//        for (Person human : myFamily) {
//            System.out.println(human);
//        }
    }
}
