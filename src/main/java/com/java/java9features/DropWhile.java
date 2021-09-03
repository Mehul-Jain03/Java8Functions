package com.java.java9features;

import java.util.stream.Collectors;
import java.util.stream.Stream;

public class DropWhile {

    public static void main(String[] args) {
        Stream<Integer> num =  Stream.of(1,4,3,7,5,0,2,4);

        System.out.println(
                num.dropWhile(i -> i<5).collect(Collectors.toList())
        );
    }
}
