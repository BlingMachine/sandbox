package org.example.generics;

public class GenericUsage {
    public static void main(String[] args) {

        Box<Integer, Integer> box1 = new Box<>(12);
        Box<Integer, Integer> box2 = new Box<>(163);
        Box<Double, Double> box3 = new Box<>(163.0);
        Box<String, String> box4 = new Box<>("Hi");

        System.out.println(box1);
        System.out.println(box2);
        System.out.println(box3);
        System.out.println(box4);
    }
}
