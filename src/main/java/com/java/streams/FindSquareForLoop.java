package com.java.streams;

import java.util.ArrayList;
import java.util.List;

public class FindSquareForLoop {

    public static void main(String[] args) {
        List<Integer> ints = new ArrayList<Integer>();
        ints.add(12);
        ints.add(2);
        ints.add(3);
        ints.add(9);
        ints.add(5);
        ints.add(6);
        ints.add(7);
        ints.add(1);
        ints.add(8);
        ints.add(13);

        // Problem Statement : From list print the square of number which is even. We need only 3 numbers.

        //Via simple for each loop
/*
        int count = 0;
        for (Integer i : ints) {
            if (i % 2 == 0 && count <3) {
                System.out.println(i * i);
                count = count + 1;
            }

        }
*/

            //Via Stream
            //  ints.stream().filter(i -> i%2 == 0).limit(3).map(i -> i*i).forEach(i -> System.out.println(i));

            // Via Stream But have debugging statement
            ints.stream().
            filter(i -> {
                System.out.println("filter received :: "+i);
                return i%2 == 0;
                }).
            limit(3).
            map(i -> {
                System.out.println("map received :: "+ i);
                return i*i;
            }).
            forEach(i -> System.out.println(i));

    }
}