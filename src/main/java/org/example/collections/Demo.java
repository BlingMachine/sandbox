package org.example.collections;

import java.util.*;

public class Demo {

    public static void main(String[] args) {

        //Set<String> setOfStuff = new HashSet<>();
        //Set<String> setOfStuff = new LinkedHashSet<>();
        Set<String> setOfStuff = new TreeSet<>();
        setOfStuff.add("Hi");
        setOfStuff.add("AAA");
        setOfStuff.add("ZZZ");
        setOfStuff.add("Hi");
        setOfStuff.add("Hi");
        setOfStuff.add("There");
        ((NavigableSet)setOfStuff).lower("Z");
        System.out.println(setOfStuff);

        List<String> listOfStuff = new ArrayList<>();
        listOfStuff.add("Hello");
        listOfStuff.add("Hello");
        listOfStuff.add("Hello");
        listOfStuff.add("World");
        System.out.println(listOfStuff);

        setOfStuff.addAll(listOfStuff);

        System.out.println(setOfStuff);
    }
}
