package com.pluralsight.collection;

import java.util.ArrayList;
import java.util.List;

public class FixedList<T> {

    // Declares a generic list called items that stores T type objects and declaring maxSize
    private List<T> items;
    private int maxSize;

    // Constructor initializes the empty list and the maxSize
    public FixedList(int maxSize) {
        this.maxSize = maxSize;
        this.items = new ArrayList<>();
    }

    // Method will add an item to the list while it's less than max size
    public void add(T item) { if (items.size() < maxSize) items.add(item); }

    // Return the list of items
    public List<T> getItems() { return items; }
}
