package com.java.supplier;

import java.util.*;
import java.util.stream.IntStream;

public class SumOfInt {

    public static void main(String[] args) {
        List<Integer> list = new ArrayList<>();
        Collections.addAll(list,1,2,3,4,5,6,7,8,9);

/*      1. General Approach
        int sum = 0;
        for(int i : list){
            sum = sum+i;
        }*/

/*      2. Bad Approach
        Optional<Integer> op = list.stream().reduce((a, b) -> a+b);
        System.out.println(op.get());*/

/*        3. Good Approach
        int sum =   list.stream().mapToInt(a -> a).sum();
        System.out.println(sum);*/


/*
        for(int i =0;i<10;i++){
            System.out.println("Hello World : " + i);
        }
*/
         // IntStream.range(1,10).forEach( i -> System.out.println("Hello World : "+i));
        IntStream.rangeClosed(1,10).forEach( i -> System.out.println("Hello World : "+i));
    }

}