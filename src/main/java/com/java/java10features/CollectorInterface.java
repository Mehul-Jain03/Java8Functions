package com.java.java10features;

import java.util.List;
import java.util.stream.Collectors;

public class CollectorInterface {

    public static void main(String[] args) {
       var list = List.of(1,3,4,7,8,9);

       var newList = list.stream().filter(i -> i%2 == 0).collect(Collectors.toUnmodifiableList());

    }
}
