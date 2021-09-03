package com.java.java11features;

import java.util.stream.Collectors;

public class StringMethods {

    public static void main(String[] args) {

        // isBlank and lines method

        String s = "";
        System.out.println(s.isEmpty()); // it takes space in count -> true
        System.out.println(s.isBlank()); // it does not count spaces -> true

        String sm = " ";
        System.out.println(sm.isEmpty()); // it takes space in count -> false
        System.out.println(sm.isBlank()); // it does not count spaces -> true

        String str = "hi\nhello\nhow are you?";

        var list = str.lines().collect(Collectors.toList());
        System.out.println(list);

    }
}