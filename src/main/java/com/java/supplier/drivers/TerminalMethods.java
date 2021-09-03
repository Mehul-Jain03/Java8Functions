package com.java.supplier.drivers;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;

public class TerminalMethods {

    public static void main(String[] args) {
        List<String> fruits = new ArrayList<>();

        fruits.add("banana");
        fruits.add("apple");
        fruits.add("kiwi");
        fruits.add("grape");

       // System.out.println(fruits.stream().filter(fruit -> fruit.length()>5).count());

       // System.out.println(fruits.stream().filter(s -> s.length()>4).findFirst().get());

       // System.out.println(fruits.stream().filter(s -> s.length()>4).min(Comparator.naturalOrder()).get());

       // System.out.println(fruits.stream().filter(s -> s.length()>4).max(Comparator.naturalOrder()).get());

      //  System.out.println(fruits.stream().anyMatch(s -> s.contains("e")));

        System.out.println(fruits.stream().noneMatch(s -> s.contains("z")));
    }
}