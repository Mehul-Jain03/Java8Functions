package com.java.streams;

import java.util.ArrayList;
import java.util.List;

public class FindSquareSorted {

    public static void main(String[] args) {
        List<Integer> ints = new ArrayList<Integer>();
        ints.add(1);
        ints.add(2);
        ints.add(3);
        ints.add(4);
        ints.add(5);
        ints.add(6);
        ints.add(7);
        ints.add(8);
        ints.add(9);

 /*       ints.stream().
                filter(i -> {
                System.out.println("In Filter : "+i);
                return i%2==0;}).
                limit(3).
                sorted().
                map(i -> i*i).
                forEach( i -> System.out.println(i));
*/

        ints.stream().filter( i -> i>5 && i%2 ==0).map(i -> i*i+2).forEach(i -> System.out.println(i));

    }




}
