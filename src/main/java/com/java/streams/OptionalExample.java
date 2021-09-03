package com.java.streams;

import java.util.Comparator;
import java.util.Locale;
import java.util.Optional;
import java.util.stream.Stream;

public class OptionalExample {


    public static void main(String[] args) {
        String a = "Mehul";
        String b = "Jayesh";
        String c = "Ajay";

        Optional<String> smallest = getSmallest(a,b,c);
        if(smallest.isPresent()){
            System.out.println(smallest.get().toUpperCase());
        }
        else {
            System.out.println("No Element found");
        }

    }


    public static Optional<String> getSmallest(String val1,String val2,String val3){
        return Optional.ofNullable(null);
        // return Stream.of(val1,val2,val3).min(Comparator.naturalOrder());
    }
}
