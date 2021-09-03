package com.java.java9features;

import java.util.Map;

public class ImmutableMap {

    public static void main(String[] args) {

       Map<String, Integer> map = Map.of(
                "a" , 12,
                "b",13
        );

        System.out.println(map);

        // You can't add null
        // you Can't add/remove the elementss

    }
}
