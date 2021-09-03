package com.java.java9features;

import java.util.List;

public class ImmutableList {

    public static void main(String[] args) {
       List<Integer> list = List.of(1,4,6,9,2,6,7);
        System.out.println(list);

        // You can't add null
        // you Can't add/remove the elements

    }


}
