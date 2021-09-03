package com.java.java9features;

import java.util.stream.Collectors;
import java.util.stream.Stream;

public class TakeWhile {

    public static void main(String[] args) {
       Stream<Integer> num =  Stream.of(1,4,3,7,5,0,2,4);

/*        System.out.println(

                num.filter(i -> i<5).collect(Collectors.toList())
        );*/


        System.out.println(

                num.takeWhile(i -> i<5).collect(Collectors.toList())
        );
    }

}
