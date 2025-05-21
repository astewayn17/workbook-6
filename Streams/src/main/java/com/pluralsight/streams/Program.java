package com.pluralsight.streams;

import java.sql.SQLOutput;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Program {

    static Scanner inputBoi = new Scanner(System.in);

    public static void main(String[] args) {

        // New Array List of Person objects called people
        List<Person> people = new ArrayList<>();

        // Adding them to the list
        people.add(new Person("Liam", "Walker", 24));
        people.add(new Person("Emma", "Smith", 30));
        people.add(new Person("Noah", "Johnson", 27));
        people.add(new Person("Olivia", "Brown", 22));
        people.add(new Person("William", "Davis", 35));
        people.add(new Person("Ava", "Miller", 28));
        people.add(new Person("James", "Wilson", 26));
        people.add(new Person("Sophia", "Moore", 31));
        people.add(new Person("Benjamin", "Taylor", 29));
        people.add(new Person("Isabella", "Anderson", 23));

        // Looping through the people and adding their ages together
        // Initializing the oldest and youngest ages the first object
        // Then it assigns the oldest and youngest ages over and over
        // again due to the loop until it's not true to then be left with the correct ones
        int sumOfAllAges = 0;
        int oldestAge = people.get(0).getAge();
        int youngestAge = people.get(0).getAge();
        for (Person human : people) {
            sumOfAllAges += human.getAge();
            if (human.getAge() > oldestAge)
                oldestAge = human.getAge();
            if (human.getAge() < youngestAge)
                youngestAge = human.getAge();
        }
        System.out.println("\nThe sum of all the ages is " + sumOfAllAges + " years old.");
        System.out.println("The oldest age is " + oldestAge + " and the youngest age is " + youngestAge + ".");

        // Asking for user input to locate the name they are searching for
        System.out.print("\nPlease enter a first or last name: ");
        String inputName = inputBoi.nextLine().trim();
        // Making a new empty list called matchedPeople to store that matched people
        List<Person> matchedPeople = new ArrayList<>();
        // For every human person object in th people list, if the name matches to
        // the inputted name, add it to the matchedNames list
        for (Person human : people)
            if (human.getFirstName().equalsIgnoreCase(inputName) || human.getLastName().equalsIgnoreCase(inputName))
                matchedPeople.add(human);
        if (matchedPeople.isEmpty())
            System.out.println("\nNo people found under the entered name.");
        else {
            System.out.println("\nCorresponding people: \n");
            for (Person human : matchedPeople) {
                System.out.println(human);
            }
        }
    }
}
