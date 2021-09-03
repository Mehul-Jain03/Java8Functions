package com.java.supplier.drivers;

import java.util.ArrayList;
import java.util.List;

public class FlatMapExample {

    public static void main(String[] args) {
        List<Integer> l1 = new ArrayList<>();
        l1.add(1);
        l1.add(2);
        l1.add(3);

        List<Integer> l2 = new ArrayList<>();
        l2.add(4);
        l2.add(5);
        l2.add(6);

        List<Integer> l3 = new ArrayList<>();
        l3.add(7);
        l3.add(8);
        l3.add(9);

        List<List<Integer>> list = new ArrayList<>();
        list.add(l1);
        list.add(l2);
        list.add(l3);

                list.
                stream().flatMap(l -> l.stream()).
                forEach( i -> System.out.println(i));

    }

}