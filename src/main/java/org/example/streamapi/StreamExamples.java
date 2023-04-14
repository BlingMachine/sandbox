package org.example.streamapi;

import java.util.*;
import java.util.function.*;
import java.util.stream.*;

public class StreamExamples {

    public static void main(String[] args) {

        //data
        List<Integer> numbers = Arrays.asList(1, 2,3, 4, 5, 5);
        List<String> names = Arrays.asList("Reflection", "collection", "stream", "java");
        IntPredicate evenOnly = x -> x % 2 == 0;
        Predicate<Integer> evenOnlyPredicate = x -> x % 2 == 0;

        //intermeddiate operation
        //map
        List<Integer> square = numbers
                .stream()
                .map(x -> Integer.valueOf(Double.toString(Math.pow(x, 2)))) //monad
                .collect(Collectors.toList());
        square.forEach(System.out::println);

        //filter
        List<String> result = names
                .stream()
                .filter(s -> s.startsWith("s"))
                .collect(Collectors.toList());
        result.forEach(System.out::println);

        //sorted
        List<String> result2 = names
                .stream()
                .sorted()
                .collect(Collectors.toList());
        result2.forEach(System.out::println);

        //terminal operations

        //collect
        Set<Integer> squared = numbers
                .stream()
                .map(x -> x * x)
                .collect(Collectors.toSet());
        squared.forEach(System.out::println);

        //forEach
        numbers.stream()
                .map(x -> x* x)
                .forEach(y -> System.out.println(y));

    }
}
