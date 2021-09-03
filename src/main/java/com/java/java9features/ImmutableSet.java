package com.java.java9features;

import java.util.Set;

public class ImmutableSet {

    public static void main(String[] args) {
        Set<Integer> sets = Set.of(1,4,8,3,9);

        System.out.println(sets);

        // You can't add null
        // you Can't add/remove the elements

    }

}
