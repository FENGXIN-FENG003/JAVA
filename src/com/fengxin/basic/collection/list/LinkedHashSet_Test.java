package com.fengxin.basic.collection.list;

import java.util.LinkedHashSet;

/**
 * @author FENGXIN
 * @data 2024.5.6
 **/
public class LinkedHashSet_Test {
    public static void main (String[] args) {
        // Create a LinkedHashSet
        LinkedHashSet<String> linkedHashSet = new LinkedHashSet<>();

        // Add elements
        linkedHashSet.add("Apple");
        linkedHashSet.add("Banana");
        linkedHashSet.add("Cherry");

        // Print the LinkedHashSet
        System.out.println("LinkedHashSet: " + linkedHashSet);

        // Remove an element
        linkedHashSet.remove("Banana");

        // Print the LinkedHashSet after removal
        System.out.println ("LinkedHashSet after removal: " + linkedHashSet);
    }
}