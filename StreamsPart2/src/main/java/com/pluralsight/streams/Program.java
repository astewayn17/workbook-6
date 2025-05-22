package com.pluralsight.streams;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
import java.util.stream.Collectors;

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

        // Asking for user input to locate the name they are searching for
        System.out.print("\nPlease enter a first or last name: ");
        String inputName = inputBoi.nextLine().trim();
        List<Person> matchedPeople = people.stream()
                .filter(human -> human.getFirstName().equalsIgnoreCase(inputName))
                .toList();
        if (matchedPeople.isEmpty())
            System.out.println("\nNo people found using the entered name.");
        else {
            System.out.println("\nCorresponding people: \n");
            matchedPeople.forEach(System.out::println);
        }

        // Looking for the sum of all ages which is then equal the stream sequence of the people list
        // using .map to obtain the age of that exact person and then gets their age and then adds them
        // all together starting from 0
        int sumAllAges = people.stream()
                .map(Person::getAge)
                .reduce(0, Integer::sum);
        double avgAge = (double) sumAllAges / people.size(); // This converts the sum of all ages to double
        System.out.printf("\nThe average of all the ages is " + avgAge + " years old.\n");

        // Looking for the oldest and youngest ages which is then equal the stream sequence of the people
        // list using the .map to get ages and then using the .reduce with max logic using the 0 as the
        // small identity to find ages greater than it and the opposite for youngest age
        int oldestAge = people.stream()
                .map(Person::getAge)
                .reduce(0, Integer::max);
        int youngestAge = people.stream()
                .map(Person::getAge)
                .reduce(1000, Integer::min);
        System.out.println("The oldest age is " + oldestAge + " and the youngest age is " + youngestAge + ".");
    }
}
//     ⬇️ This is all standard loop info from the original Stream project ⬇️

        // Looping through the people and adding their ages together
        // Initializing the oldest and youngest ages the first object
        // Then it assigns the oldest and youngest ages over and over
        // again due to the loop until it's not true to then be left with the correct ones
//        int sumOfAllAges = 0;
//        int oldestAge = people.get(0).getAge();
//        int youngestAge = people.get(0).getAge();
//        for (Person human : people) {
//            sumOfAllAges += human.getAge();
//            if (human.getAge() > oldestAge)
//                oldestAge = human.getAge();
//            if (human.getAge() < youngestAge)
//                youngestAge = human.getAge();
//        }
//        double avg = sumOfAllAges / people.size();
//        System.out.println("\nThe average of all the ages is " + avg + " years old.");
//        System.out.println("The oldest age is " + oldestAge + " and the youngest age is " + youngestAge + ".");

        // Asking for user input to locate the name they are searching for
//        System.out.print("\nPlease enter a first or last name: ");
//        String inputName = inputBoi.nextLine().trim();
        // Making a new empty list called matchedPeople to store that matched people
//        List<Person> matchedPeople = new ArrayList<>();
        // For every human person object in th people list, if the name matches to
        // the inputted name, add it to the matchedNames list

//        for (Person human : people)
//            if (human.getFirstName().equalsIgnoreCase(inputName) || human.getLastName().equalsIgnoreCase(inputName))
//                matchedPeople.add(human);
//        if (matchedPeople.isEmpty())
//            System.out.println("\nNo people found under the entered name.");
//        else {
//            System.out.println("\nCorresponding people: \n");
//            for (Person human : matchedPeople) {
//                System.out.println(human);


