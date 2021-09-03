package com.java.consumer;

import com.google.common.util.concurrent.Uninterruptibles;

import java.util.*;
import java.util.concurrent.TimeUnit;
import java.util.function.BiConsumer;
import java.util.function.Consumer;
import java.util.function.Function;
import java.util.function.Predicate;

public class TestMain {

    public static void main(String[] args) {

        Consumer<String> c1 = (s) -> System.out.println(s);

     //   c1.accept("Mehul");


        List<String> l1 = new ArrayList<>();
        l1.add("Mehul");
        l1.add("karan");

      //  l1.forEach(c1);

     //   l1.forEach(s -> System.out.println(s.toUpperCase()));

        Consumer<String> dbConsumer = (s) -> System.out.println("I am writing in DB : "+s);

        Consumer<String> logConsumer = (s) -> System.out.println("I am writing in Log : "+s);
        // l1.forEach(dbConsumer);
       // l1.forEach(logConsumer);

        Consumer<String> dblogConsumer = dbConsumer.andThen(logConsumer);

        // l1.forEach(dblogConsumer);


        Map<String,Consumer<String>> map = new HashMap<>();
        map.put("db",dbConsumer);
        map.put("logging",logConsumer);
        map.put("dblogging",dblogConsumer);

        // l1.forEach(map.get(System.getProperty("db")));


        BiConsumer<String,Integer> biConsumer = (s,i) -> {
            System.out.println("My Name is : "+s);
            System.out.println("My Age is : "+i);
        };

       // biConsumer.accept("Mehul",10);

      /* map.forEach((k,v) -> {
            System.out.println("The key is : "+ k);
        });
*/
        System.out.println("---------------------------------");

        Predicate<Integer> isGT2 = (i) -> i>2;
        Predicate<Integer> isGT10 = (i) -> i<10;


      //  System.out.println(isGT2.and(isGT10).test(11));

        System.out.println("---------------------------------");

        Function<String,Integer> sLength = (s) -> s.length();
        Function<Integer,Integer> square = (i) -> i*i;

      //  System.out.println(sLength.andThen(square).apply("Hi Hello How Are You!!"));



        System.out.println("---------------------------------");

        Runnable r = () -> {
            Uninterruptibles.sleepUninterruptibly(2, TimeUnit.SECONDS);
            System.out.println("Hi");
        };

        new Thread(r).start();

       // System.out.println("How are you?");

        System.out.println("---------------------------------");

    }
}