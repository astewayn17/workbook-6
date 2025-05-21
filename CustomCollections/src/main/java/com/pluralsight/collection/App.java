package com.pluralsight.collection;

import java.time.LocalDate;

public class App {

    public static void main(String[] args) {

        // Creates a FixedList (that internally uses an ArrayList)
        // with a maximum size of 3 to store Strings, then adds three words to it
        FixedList<String> words = new FixedList<>(3);
        words.add("Cheese");
        words.add("Cat");
        words.add("Cure");
        words.add("Canteen"); // This line should fail

        System.out.println(words.getItems().size());

        FixedList<LocalDate> dates = new FixedList<>(2);
        dates.add(LocalDate.now());
        dates.add(LocalDate.now());
        dates.add(LocalDate.now()); // This line should fail

        System.out.println(dates.getItems().size());
    }
}
